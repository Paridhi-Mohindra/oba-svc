package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomesticResponse5DataRefund {

    @JsonProperty("Account")
    private OBWriteDomesticResponse5DataRefundAccount account = null;

}
