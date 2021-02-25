package com.openbanking.spec.obsaccountinfo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OBReadBalance1DataBalance {

	@JsonProperty("AccountId")
	  private String accountId = null;

	  @JsonProperty("CreditDebitIndicator")
	  private OBCreditDebitCode2 creditDebitIndicator = null;

	  @JsonProperty("Type")
	  private OBBalanceType1Code type = null;

	  @JsonProperty("DateTime")
	  private String dateTime = null;

	  @JsonProperty("Amount")
	  private OBReadBalance1DataAmount amount = null;

	  @JsonProperty("CreditLine")
	  private List<OBReadBalance1DataCreditLine> creditLine = null;
}
