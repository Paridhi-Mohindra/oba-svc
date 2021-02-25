package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class TransactionRequestsWithCharge {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("from")
    private From from;

    @JsonProperty("details")
    private Details details;

    @JsonProperty("transaction_ids")
    private List<String> transactionIds = null;

    @JsonProperty("status")
    private String status;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("challenge")
    private Object challenge;

    @JsonProperty("charge")
    private Charge charge;

}
