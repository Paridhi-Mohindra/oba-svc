package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class Details {

    @JsonProperty("to_sandbox_tan")
    private ToSandboxTan toSandboxTan;

    @JsonProperty("value")
    private Value value;

    @JsonProperty("description")
    private String description;

}
