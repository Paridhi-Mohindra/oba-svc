package com.openbanking.spec.obsaccountinfo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
public class OBReadBalance1DataCreditLine {

	@JsonProperty("Included")
	private Boolean included = null;

	/**
	 * Limit type, in a coded form.
	 */
	public enum TypeEnum {
		AVAILABLE("Available"),

		CREDIT("Credit"),

		EMERGENCY("Emergency"),

		PRE_AGREED("Pre-Agreed"),

		TEMPORARY("Temporary");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("Type")
	private TypeEnum type = null;

	@JsonProperty("Amount")
	private OBReadBalance1DataAmount1 amount = null;

	public OBReadBalance1DataCreditLine included(Boolean included) {
		this.included = included;
		return this;
	}
}
