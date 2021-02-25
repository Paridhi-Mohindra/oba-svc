package com.openbanking.spec.obspaymentinitiation.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

import com.openbanking.spec.obspaymentinitiation.service.PaymentService;
import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response.*;
import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request.OBWriteDomestic2;
import com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest.TransactionTo;
import com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest.TransactionValue;
import com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest.TransactionRequest;
import com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse.TransactionResponse;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${obp.header.authorization}")
    private String authorizationHeader;

    @Value("${obp.url.base}")
    private String baseUrl;

    @Override
    public OBWriteDomesticResponse5 createDomesticPayments(OBWriteDomestic2 obWriteDomestic2) throws ParseException {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", authorizationHeader);
        httpHeaders.set("Content-Type", "application/json");


        // Convert OBA-Domestic-Payment-Consent request body to transaction request body.
        TransactionTo transactionTo = new TransactionTo();
        transactionTo.setAccountId(obWriteDomestic2.getData().getInitiation().getCreditorAccount().getIdentification());
        transactionTo.setBankId("Bank-One");

        TransactionValue transactionValue = new TransactionValue();
        transactionValue.setAmount(obWriteDomestic2.getData().getInitiation().getInstructedAmount().getAmount());
        transactionValue.setCurrency(obWriteDomestic2.getData().getInitiation().getInstructedAmount().getCurrency());

        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setTo(transactionTo);
        transactionRequest.setValue(transactionValue);
        transactionRequest.setDescription(obWriteDomestic2.getRisk().getPaymentContextCode().toString());

        HttpEntity entity = new HttpEntity(transactionRequest, httpHeaders);
        
        // OBA-Create_domestic-Payments internally calling OBP-transaction request API
        String endpoint = String.format("/accounts/%s/owner/transaction-request-types/ACCOUNT/transaction-requests",
                obWriteDomestic2.getData().getInitiation().getDebtorAccount().getIdentification());

        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + endpoint).toUriString();

        ResponseEntity<TransactionResponse> obpTransactionResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
                TransactionResponse.class);
        TransactionResponse transactionResponse = obpTransactionResponse.getBody();

        // Converting OPB transaction request back to OBA-Domestic-Payment response format.
        List<OBWriteDomesticConsentResponse5DataCharges> charges= new ArrayList<>();
        charges.add(OBWriteDomesticConsentResponse5DataCharges.builder()
                .type("ACCOUNT")
                .amount(OBActiveOrHistoricCurrencyAndAmount.builder()
                        .amount(transactionResponse.getCharge().getValue().getAmount())
                        .currency(transactionResponse.getCharge().getValue().getCurrency())
                        .build())
                .build());

        return OBWriteDomesticResponse5.builder()
                .data(OBWriteDomesticResponse5Data.builder()
                                .domesticPaymentId(transactionResponse.getId())
                                .consentId(transactionResponse.getId())
                                .creationDateTime(transactionResponse.getStartDate().substring(0,10))
                                .status(transactionResponse.getStatus())
                                .statusUpdateDateTime(transactionResponse.getStartDate().substring(0,10))
                                .expectedExecutionDateTime(transactionResponse.getStartDate().substring(0,10))
                                .expectedSettlementDateTime(transactionResponse.getEndDate().substring(0,10))
                                .charges(charges)
                                .initiation(obWriteDomestic2.getData().getInitiation())
                                .debtor(OBDebtorIdentification1.builder()
                                        .name(obWriteDomestic2.getData().getInitiation().getDebtorAccount().getName()).build())
                                .build())
                .build();

    }

}
