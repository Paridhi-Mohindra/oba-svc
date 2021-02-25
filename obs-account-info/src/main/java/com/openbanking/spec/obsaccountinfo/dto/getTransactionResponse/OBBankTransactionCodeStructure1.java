package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBBankTransactionCodeStructure1 {

    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("SubCode")
    private String subCode = null;

}
