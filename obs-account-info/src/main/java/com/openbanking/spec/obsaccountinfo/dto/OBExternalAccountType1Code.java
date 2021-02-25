package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalAccountType1Code {

	BUSINESS("Business"),

	PERSONAL("Personal");

	private String value;

	OBExternalAccountType1Code(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static OBExternalAccountType1Code fromValue(String text) {
		for (OBExternalAccountType1Code b : OBExternalAccountType1Code.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
