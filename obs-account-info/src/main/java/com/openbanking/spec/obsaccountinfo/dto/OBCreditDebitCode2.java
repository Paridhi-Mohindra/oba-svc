package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBCreditDebitCode2 {

	CREDIT("Credit"),

	DEBIT("Debit");

	private String value;

	OBCreditDebitCode2(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static OBCreditDebitCode2 fromValue(String text) {
		for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
