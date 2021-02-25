package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OBExternalAccountSubType1Code {

	CHARGECARD("ChargeCard"),

	CREDITCARD("CreditCard"),

	CURRENTACCOUNT("CurrentAccount"),

	EMONEY("EMoney"),

	LOAN("Loan"),

	MORTGAGE("Mortgage"),

	PREPAIDCARD("PrePaidCard"),

	SAVINGS("Savings");

	private String value;

	OBExternalAccountSubType1Code(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static OBExternalAccountSubType1Code fromValue(String text) {
		for (OBExternalAccountSubType1Code b : OBExternalAccountSubType1Code.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
