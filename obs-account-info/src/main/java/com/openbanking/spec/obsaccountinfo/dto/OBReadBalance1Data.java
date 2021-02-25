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
@NoArgsConstructor
@AllArgsConstructor
public class OBReadBalance1Data {
	@JsonProperty("Balance")
	  private List<OBReadBalance1DataBalance> balance = new ArrayList<OBReadBalance1DataBalance>();
	
}
