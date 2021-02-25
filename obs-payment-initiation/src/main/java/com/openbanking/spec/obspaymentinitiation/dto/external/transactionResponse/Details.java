package com.openbanking.spec.obspaymentinitiation.dto.external.transactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Details {
    @JsonProperty("to_sandbox_tan")
    private ToSandboxTan toSandboxTan;

    private Value value;
    private String description;
}
