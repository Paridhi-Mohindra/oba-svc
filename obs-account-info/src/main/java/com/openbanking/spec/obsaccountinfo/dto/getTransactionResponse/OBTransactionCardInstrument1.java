package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBTransactionCardInstrument1 {

    public enum CardSchemeNameEnum {
        AMERICANEXPRESS("AmericanExpress"),

        DINERS("Diners"),

        DISCOVER("Discover"),

        MASTERCARD("MasterCard"),

        VISA("VISA");

        private String value;

        CardSchemeNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CardSchemeNameEnum fromValue(String text) {
            for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("CardSchemeName")
    private CardSchemeNameEnum cardSchemeName = null;

    /**
     * The card authorisation type.
     */
    public enum AuthorisationTypeEnum {
        CONSUMERDEVICE("ConsumerDevice"),

        CONTACTLESS("Contactless"),

        NONE("None"),

        PIN("PIN");

        private String value;

        AuthorisationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthorisationTypeEnum fromValue(String text) {
            for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("AuthorisationType")
    private AuthorisationTypeEnum authorisationType = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("Identification")
    private String identification = null;

}
