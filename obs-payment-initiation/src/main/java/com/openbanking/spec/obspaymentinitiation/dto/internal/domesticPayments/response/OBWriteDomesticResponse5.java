package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomesticResponse5 {

    @JsonProperty("Data")
    private OBWriteDomesticResponse5Data data = null;

    @JsonProperty("Links")
    private Links links = null;

    @JsonProperty("Meta")
    private Meta meta = null;

}
