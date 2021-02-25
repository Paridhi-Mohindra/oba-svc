package com.openbanking.spec.obsaccountinfo.dto;

import java.util.ArrayList;
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
@AllArgsConstructor
@NoArgsConstructor
public class OBAccount6 {

	@JsonProperty("AccountId")
	private String accountId = null;

	@JsonProperty("Status")
	private OBAccountStatus1Code status = null;

	@JsonProperty("StatusUpdateDateTime")
	private String statusUpdateDateTime = null;

	@JsonProperty("Currency")
	private String currency = null;

	@JsonProperty("AccountType")
	private OBExternalAccountType1Code accountType = null;

	@JsonProperty("AccountSubType")
	private OBExternalAccountSubType1Code accountSubType = null;

	@JsonProperty("Description")
	private String description = null;

	@JsonProperty("Nickname")
	private String nickname = null;

	@JsonProperty("OpeningDate")
	private String openingDate = null;

	@JsonProperty("MaturityDate")
	private String maturityDate = null;

	@JsonProperty("SwitchStatus")
	private String switchStatus = null;

	@JsonProperty("Account")
	private List<OBAccount4Account> account = null;

	@JsonProperty("Servicer")
	private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

}
