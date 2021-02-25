package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.openbanking.spec.obsaccountinfo.dto.Meta;
import com.openbanking.spec.obsaccountinfo.dto.Links;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBReadTransaction6 {

    @JsonProperty("Data")
    private OBReadDataTransaction6 data = null;

    @JsonProperty("Links")
    private Links links = null;

    @JsonProperty("Meta")
    private Meta meta = null;

}
