package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonCreator;

@Getter
@NoArgsConstructor
public enum OBTransactionMutability1Code {

    MUTABLE("Mutable"),

    IMMUTABLE("Immutable");

    private String value;

    OBTransactionMutability1Code(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBTransactionMutability1Code fromValue(String text) {
        for (OBTransactionMutability1Code b : OBTransactionMutability1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
