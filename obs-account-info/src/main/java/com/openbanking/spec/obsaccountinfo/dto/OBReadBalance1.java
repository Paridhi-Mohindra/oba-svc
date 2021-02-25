package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class OBReadBalance1 {
	
	@JsonProperty("Data")
	  private OBReadBalance1Data data = null;

	  @JsonProperty("Links")
	  private Links links = null;

	  @JsonProperty("Meta")
	  private Meta meta = null;
}
