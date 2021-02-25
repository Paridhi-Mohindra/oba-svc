package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomestic2 {

    @JsonProperty("Data")
    private OBWriteDomestic2Data data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

}
