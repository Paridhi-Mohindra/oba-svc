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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBReadAccount6 {

	@JsonProperty("Data")
	private OBReadAccount6Data data = null;

	@JsonProperty("Links")
	private Links links = null;

	@JsonProperty("Meta")
	private Meta meta = null;

}
