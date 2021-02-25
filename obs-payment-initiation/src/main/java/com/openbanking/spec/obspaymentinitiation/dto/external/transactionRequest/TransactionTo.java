package com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionTo {
    @JsonProperty("bank_id")
    private String bankId;

    @JsonProperty("account_id")
    private String accountId;
}
