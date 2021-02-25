package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBRisk1 {
    public enum PaymentContextCodeEnum {
        BILLPAYMENT("BillPayment"),

        ECOMMERCEGOODS("EcommerceGoods"),

        ECOMMERCESERVICES("EcommerceServices"),

        OTHER("Other"),

        PARTYTOPARTY("PartyToParty");

        private String value;

        PaymentContextCodeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PaymentContextCodeEnum fromValue(String text) {
            for (PaymentContextCodeEnum b : PaymentContextCodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("PaymentContextCode")
    private PaymentContextCodeEnum paymentContextCode = null;

    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode = null;

    @JsonProperty("MerchantCustomerIdentification")
    private String merchantCustomerIdentification = null;

    @JsonProperty("DeliveryAddress")
    private OBRisk1DeliveryAddress deliveryAddress = null;
}
