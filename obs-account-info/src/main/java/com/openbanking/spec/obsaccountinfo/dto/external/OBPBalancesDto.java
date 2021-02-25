package com.openbanking.spec.obsaccountinfo.dto.external;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OBPBalancesDto {
	
	@JsonProperty("accounts")
	private List<AccountBalance> accountBalances = null;

	
}
