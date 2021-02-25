package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonCreator;

@Getter
public enum OBChargeBearerType1Code {

    BORNEBYCREDITOR("BorneByCreditor"),

    BORNEBYDEBTOR("BorneByDebtor"),

    FOLLOWINGSERVICELEVEL("FollowingServiceLevel"),

    SHARED("Shared");

    private String value;

    OBChargeBearerType1Code(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBChargeBearerType1Code fromValue(String text) {
        for (OBChargeBearerType1Code b : OBChargeBearerType1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
