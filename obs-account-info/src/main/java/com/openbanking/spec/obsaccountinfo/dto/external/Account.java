package com.openbanking.spec.obsaccountinfo.dto.external;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

	private String id;
	private String label;
	@JsonProperty("bank_id")
	private String bankId;
	@JsonProperty("views_available")
	private List<OBPViewsAvailableDto> viewsAvailable = null;
}
