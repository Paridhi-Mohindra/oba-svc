package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@ApiModel(description = "Provides the details to identify an account.")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBAccount4Account {

	@JsonProperty("SchemeName")
	@NonNull
	private String schemeName = null;

	@JsonProperty("Identification")
	private String identification = null;

	@JsonProperty("Name")
	private String name = null;

	@JsonProperty("SecondaryIdentification")
	@NonNull
	private String secondaryIdentification = null;
}
