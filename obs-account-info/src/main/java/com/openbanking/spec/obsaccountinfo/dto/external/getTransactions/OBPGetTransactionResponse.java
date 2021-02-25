package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class OBPGetTransactionResponse {

    @JsonProperty("transaction_requests_with_charges")
    private List<TransactionRequestsWithCharge> transactionRequestsWithCharges = null;

}
