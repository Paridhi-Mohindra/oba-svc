package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1DataCreditLine.TypeEnum;

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
public class OBReadBalance1DataAmount1 {

	@JsonProperty("Amount")
	private String amount = null;

	@JsonProperty("Currency")
	private String currency = null;

	public OBReadBalance1DataAmount1 amount(String amount) {
		this.amount = amount;
		return this;
	}
}
