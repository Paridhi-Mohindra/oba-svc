package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBReadDataTransaction6 {

    @JsonProperty("Transaction")
    private List<OBTransaction6> transaction = null;

}
