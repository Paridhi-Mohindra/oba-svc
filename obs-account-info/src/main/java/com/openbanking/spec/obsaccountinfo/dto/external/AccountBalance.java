package com.openbanking.spec.obsaccountinfo.dto.external;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBalance {

	@JsonProperty("account_id")
	private String accountId;
	@JsonProperty("bank_id")
	private String bankId;
	@JsonProperty("account_routings")
	private List<AccountRouting> accountRoutings = null;
	
	private String label;
	
	private List<Balance> balances = null;
}
