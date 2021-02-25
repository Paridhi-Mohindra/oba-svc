package com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class From {
    @JsonProperty("bank_id")
    private String bankId;
    @JsonProperty("account_id")
    private String accountId;
}
