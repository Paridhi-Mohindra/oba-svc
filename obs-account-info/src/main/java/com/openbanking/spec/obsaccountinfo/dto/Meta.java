package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meta {

	@JsonProperty("TotalPages")
	private Integer totalPages = null;

	@JsonProperty("FirstAvailableDateTime")
	private String firstAvailableDateTime = null;

	@JsonProperty("LastAvailableDateTime")
	private String lastAvailableDateTime = null;
}
