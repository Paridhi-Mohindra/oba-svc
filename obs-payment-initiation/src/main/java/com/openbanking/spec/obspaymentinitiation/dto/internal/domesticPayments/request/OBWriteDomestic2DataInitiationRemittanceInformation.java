package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomestic2DataInitiationRemittanceInformation {

    @JsonProperty("Unstructured")
    private String unstructured = null;

    @JsonProperty("Reference")
    private String reference = null;

}
