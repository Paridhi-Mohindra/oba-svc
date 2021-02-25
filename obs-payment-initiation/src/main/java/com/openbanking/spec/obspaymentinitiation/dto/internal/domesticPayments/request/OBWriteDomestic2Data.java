package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomestic2Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("Initiation")
    private OBWriteDomestic2DataInitiation initiation = null;
}
