package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Links {
    @JsonProperty("Self")
    private String self = null;

    @JsonProperty("First")
    private String first = null;

    @JsonProperty("Prev")
    private String prev = null;

    @JsonProperty("Next")
    private String next = null;

    @JsonProperty("Last")
    private String last = null;

}
