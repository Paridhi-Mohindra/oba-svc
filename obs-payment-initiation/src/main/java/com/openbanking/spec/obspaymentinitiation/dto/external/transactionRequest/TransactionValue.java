package com.openbanking.spec.obspaymentinitiation.dto.external.transactionRequest;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionValue {
    private String currency;
    private String amount;
}
