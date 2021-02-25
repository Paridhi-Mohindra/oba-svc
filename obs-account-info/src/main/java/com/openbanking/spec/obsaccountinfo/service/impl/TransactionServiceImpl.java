package com.openbanking.spec.obsaccountinfo.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

import com.openbanking.spec.obsaccountinfo.service.TransactionService;
import com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse.*;
import com.openbanking.spec.obsaccountinfo.dto.external.getTransactions.OBPGetTransactionResponse;
import com.openbanking.spec.obsaccountinfo.dto.external.getTransactions.TransactionRequestsWithCharge;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${obp.header.authorization}")
    private String authorizationHeader;

    @Value("${obp.url.base}")
    private String baseUrl;

    @Override
    public OBReadTransaction6 getTransactionsByAccountId(String accountId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", authorizationHeader);

        HttpEntity entity = new HttpEntity(httpHeaders);

        String endpoint = String.format("/accounts/%s/owner/transaction-requests", accountId);

        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + endpoint).toUriString();

        ResponseEntity<OBPGetTransactionResponse> obpGTransactionResponse = restTemplate.exchange(url, HttpMethod.GET, entity,
                OBPGetTransactionResponse.class);
        OBPGetTransactionResponse response = obpGTransactionResponse.getBody();

        List<OBTransaction6> obTransaction6s = new ArrayList<>();

        for (int i = 0; i < response.getTransactionRequestsWithCharges().size(); i++) {
            TransactionRequestsWithCharge transactionRequestsWithCharge = response.getTransactionRequestsWithCharges().get(i);
            obTransaction6s.add(
                    OBTransaction6.builder()
                            .accountId(accountId)
                            .transactionId(transactionRequestsWithCharge.getId())
                            .status(transactionRequestsWithCharge.getStatus())
                            .bookingDateTime(transactionRequestsWithCharge.getStartDate().substring(0,10))
                            .valueDateTime(transactionRequestsWithCharge.getEndDate().substring(0,10))
                            .transactionInformation(transactionRequestsWithCharge.getDetails().getDescription())
                            .amount(OBActiveOrHistoricCurrencyAndAmount9.builder()
                                    .amount(transactionRequestsWithCharge.getDetails().getValue().getAmount())
                                    .currency(transactionRequestsWithCharge.getDetails().getValue().getCurrency())
                                    .build())
                            .chargeAmount(OBActiveOrHistoricCurrencyAndAmount10.builder()
                                    .amount(transactionRequestsWithCharge.getCharge().getValue().getAmount())
                                    .currency(transactionRequestsWithCharge.getCharge().getValue().getAmount())
                                    .build())
                            .creditorAccount(OBCashAccount60.builder()
                                    .identification(transactionRequestsWithCharge.getDetails().getToSandboxTan().getAccountId())
                                    .name(transactionRequestsWithCharge.getFrom().getBankId())
                                    .secondaryIdentification(transactionRequestsWithCharge.getDetails().getToSandboxTan().getAccountId())
                                    .build())
                            .debtorAccount(OBCashAccount61.builder()
                                    .identification(transactionRequestsWithCharge.getFrom().getAccountId())
                                    .name(transactionRequestsWithCharge.getFrom().getBankId())
                                    .secondaryIdentification(transactionRequestsWithCharge.getFrom().getAccountId())
                                    .build())
                            .build()
            );
        }

        return OBReadTransaction6.builder()
                .data(OBReadDataTransaction6.builder()
                        .transaction(obTransaction6s)
                        .build())
                .build();

    }

}
