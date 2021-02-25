package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomesticResponse5DataMultiAuthorisation {

    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGFURTHERAUTHORISATION("AwaitingFurtherAuthorisation"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Status")
    private StatusEnum status = null;

    @JsonProperty("NumberRequired")
    private Integer numberRequired = null;

    @JsonProperty("NumberReceived")
    private Integer numberReceived = null;

    @JsonProperty("LastUpdateDateTime")
    private Date lastUpdateDateTime = null;

    @JsonProperty("ExpirationDateTime")
    private Date expirationDateTime = null;

}
