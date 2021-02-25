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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OBReadBalance1DataAmount {

	  @JsonProperty("Amount")
	  private String amount = null;

	  @JsonProperty("Currency")
	  private String currency = null;
}
