package com.openbanking.spec.obsaccountinfo.dto.external;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OBPViewsAvailableDto {
	private String id;
	@JsonProperty("short_name")
	private String shortName;
	@JsonProperty("is_public")
	private Boolean isPublic;
}
