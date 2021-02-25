package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonCreator;

@Getter
@NoArgsConstructor
public enum OBEntryStatus1Code {

    BOOKED("Booked"),

    PENDING("Pending");

    private String value;

    OBEntryStatus1Code(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static OBEntryStatus1Code fromValue(String text) {
        for (OBEntryStatus1Code b : OBEntryStatus1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

}
