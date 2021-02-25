package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class Value {

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("amount")
    private String amount;

}
