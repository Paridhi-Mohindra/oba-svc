package com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse;

import lombok.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponse {
    private String id;

    private String type;

    private From from;

    private Details details;

    @JsonProperty("transaction_ids")
    private List<String> transactionIds = null;

    private String status;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    private Object challenges;

    private Charge charge;
}
