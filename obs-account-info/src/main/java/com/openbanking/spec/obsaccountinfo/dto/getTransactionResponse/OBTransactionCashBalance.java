package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBTransactionCashBalance {

    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode2 creditDebitIndicator = null;

    @JsonProperty("Type")
    private OBBalanceType1Code type = null;

    @JsonProperty("Amount")
    private OBTransactionCashBalanceAmount amount = null;

}
