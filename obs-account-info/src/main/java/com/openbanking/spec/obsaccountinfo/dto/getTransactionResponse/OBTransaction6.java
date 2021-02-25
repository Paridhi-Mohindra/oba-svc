package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBTransaction6 {

    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("TransactionId")
    private String transactionId = null;

    @JsonProperty("TransactionReference")
    private String transactionReference = null;

    @JsonProperty("StatementReference")
    private List<String> statementReference = null;

    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode1 creditDebitIndicator = null;

    @JsonProperty("Status")
    private String status = null;
//    private OBEntryStatus1Code status = null;

    @JsonProperty("TransactionMutability")
    private OBTransactionMutability1Code transactionMutability = null;

    @JsonProperty("BookingDateTime")
    private String bookingDateTime = null;

    @JsonProperty("ValueDateTime")
    private String valueDateTime = null;

    @JsonProperty("TransactionInformation")
    private String transactionInformation = null;

    @JsonProperty("AddressLine")
    private String addressLine = null;

    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount9 amount = null;

    @JsonProperty("ChargeAmount")
    private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount = null;

    @JsonProperty("CurrencyExchange")
    private OBCurrencyExchange5 currencyExchange = null;

    @JsonProperty("BankTransactionCode")
    private OBBankTransactionCodeStructure1 bankTransactionCode = null;

    @JsonProperty("ProprietaryBankTransactionCode")
    private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

    @JsonProperty("Balance")
    private OBTransactionCashBalance balance = null;

    @JsonProperty("MerchantDetails")
    private OBMerchantDetails1 merchantDetails = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification61 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount60 creditorAccount = null;

    @JsonProperty("DebtorAgent")
    private OBBranchAndFinancialInstitutionIdentification62 debtorAgent = null;

    @JsonProperty("DebtorAccount")
    private OBCashAccount61 debtorAccount = null;

    @JsonProperty("CardInstrument")
    private OBTransactionCardInstrument1 cardInstrument = null;

//    @JsonProperty("SupplementaryData")
//    private OBSupplementaryData1 supplementaryData = null;

}
