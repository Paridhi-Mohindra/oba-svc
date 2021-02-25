package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class Charge {

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("value")
    private Value value;

}
