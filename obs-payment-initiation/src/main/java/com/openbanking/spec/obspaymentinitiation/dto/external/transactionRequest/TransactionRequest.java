package com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequest {
    private TransactionTo to;
    private TransactionValue value;
    private String description;
}
