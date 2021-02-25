package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OBBranchAndFinancialInstitutionIdentification50 {

	@JsonProperty("SchemeName")
	private String schemeName = null;

	@JsonProperty("Identification")
	private String identification = null;
}
