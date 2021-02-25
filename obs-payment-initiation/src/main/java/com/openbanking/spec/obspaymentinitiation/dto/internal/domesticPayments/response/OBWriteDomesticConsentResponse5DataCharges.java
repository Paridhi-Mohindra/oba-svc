package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomesticConsentResponse5DataCharges {

    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer = null;

    @JsonProperty("Type")
    private String type = null;

    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount amount = null;

}
