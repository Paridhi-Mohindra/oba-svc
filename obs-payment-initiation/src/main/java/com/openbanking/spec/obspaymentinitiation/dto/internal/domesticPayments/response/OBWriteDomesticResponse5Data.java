package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import lombok.*;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request.OBWriteDomestic2DataInitiation;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomesticResponse5Data {

    @JsonProperty("DomesticPaymentId")
    private String domesticPaymentId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private String creationDateTime = null;

//    /**
//     * Specifies the status of the payment information group.
//     */
//    public enum StatusEnum {
//        ACCEPTEDCREDITSETTLEMENTCOMPLETED("AcceptedCreditSettlementCompleted"),
//
//        ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),
//
//        ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),
//
//        ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),
//
//        PENDING("Pending"),
//
//        REJECTED("Rejected");
//
//        private String value;
//
//        StatusEnum(String value) {
//            this.value = value;
//        }
//
//        @Override
//        @JsonValue
//        public String toString() {
//            return String.valueOf(value);
//        }
//
//        @JsonCreator
//        public static StatusEnum fromValue(String text) {
//            for (StatusEnum b : StatusEnum.values()) {
//                if (String.valueOf(b.value).equals(text)) {
//                    return b;
//                }
//            }
//            return null;
//        }
//    }

    @JsonProperty("Status")
    private String status = null;

    @JsonProperty("StatusUpdateDateTime")
    private String statusUpdateDateTime = null;

    @JsonProperty("ExpectedExecutionDateTime")
    private String expectedExecutionDateTime = null;

    @JsonProperty("ExpectedSettlementDateTime")
    private String expectedSettlementDateTime = null;

    @JsonProperty("Refund")
    private OBWriteDomesticResponse5DataRefund refund = null;

    @JsonProperty("Charges")
    private List<OBWriteDomesticConsentResponse5DataCharges> charges = null;

    @JsonProperty("Initiation")
    private OBWriteDomestic2DataInitiation initiation = null;

    @JsonProperty("MultiAuthorisation")
    private OBWriteDomesticResponse5DataMultiAuthorisation multiAuthorisation = null;

    @JsonProperty("Debtor")
    private OBDebtorIdentification1 debtor = null;

}
