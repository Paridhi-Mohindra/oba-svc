package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBMerchantDetails1 {

    @JsonProperty("MerchantName")
    private String merchantName = null;

    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode = null;

}
