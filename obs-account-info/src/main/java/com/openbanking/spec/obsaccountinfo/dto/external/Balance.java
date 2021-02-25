package com.openbanking.spec.obsaccountinfo.dto.external;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Balance {

	private String type;
	private String currency;
	private String amount;
}
