package com.openbanking.spec.obsaccountinfo.dto.external.getTransactions;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class ToSandboxTan {

    @JsonProperty("bank_id")
    private String bankId;

    @JsonProperty("account_id")
    private String accountId;

}
