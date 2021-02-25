package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Links {

	@JsonProperty("Self")
	private String self = null;

	@JsonProperty("First")
	private String first = null;

	@JsonProperty("Prev")
	private String prev = null;

	@JsonProperty("Next")
	private String next = null;

	@JsonProperty("Last")
	private String last = null;
}
