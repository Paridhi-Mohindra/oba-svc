package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import lombok.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBWriteDomestic2DataInitiation {
    @JsonProperty("InstructionIdentification")
    private String instructionIdentification = null;

    @JsonProperty("EndToEndIdentification")
    private String endToEndIdentification = null;

    @JsonProperty("LocalInstrument")
    private String localInstrument = null;

    @JsonProperty("InstructedAmount")
    private OBWriteDomestic2DataInitiationInstructedAmount instructedAmount = null;

    @JsonProperty("DebtorAccount")
    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount = null;

    @JsonProperty("CreditorAccount")
    private OBWriteDomestic2DataInitiationCreditorAccount creditorAccount = null;

    @JsonProperty("CreditorPostalAddress")
    private OBPostalAddress6 creditorPostalAddress = null;

    @JsonProperty("RemittanceInformation")
    private OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation = null;

//    @JsonProperty("SupplementaryData")
//    private OBSupplementaryData1 supplementaryData = null;
}
