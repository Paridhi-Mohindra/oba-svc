package com.openbanking.spec.obsaccountinfo.dto.external;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OBPAccountsDto {
	
	private String id;
	private String label;
	private String bankId;
	private List<OBPViewsAvailableDto> viewsAvailable = null;

}