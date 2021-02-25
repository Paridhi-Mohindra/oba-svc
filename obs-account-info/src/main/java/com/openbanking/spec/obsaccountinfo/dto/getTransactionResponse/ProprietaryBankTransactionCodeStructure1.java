package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProprietaryBankTransactionCodeStructure1 {

    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Issuer")
    private String issuer = null;

}
