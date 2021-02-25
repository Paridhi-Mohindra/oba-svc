package com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Charge {
    private String summary;
    private Value value;
}
