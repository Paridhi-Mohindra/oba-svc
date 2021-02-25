package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonCreator;

@Getter
@NoArgsConstructor
public enum OBCreditDebitCode1 {

    CREDIT("Credit"),

    DEBIT("Debit");

    private String value;

    OBCreditDebitCode1(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBCreditDebitCode1 fromValue(String text) {
        for (OBCreditDebitCode1 b : OBCreditDebitCode1.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
