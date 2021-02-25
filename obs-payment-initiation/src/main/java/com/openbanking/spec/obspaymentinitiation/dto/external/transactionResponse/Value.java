package com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Value {
    private String currency;
    private String amount;
}
