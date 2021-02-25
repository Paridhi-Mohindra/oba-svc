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
public class OBReadAccount6Data {

	@JsonProperty("Account")
	private List<OBAccount6> account = null;
}
