package com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse;

import lombok.*;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OBCurrencyExchange5 {

    @JsonProperty("SourceCurrency")
    private String sourceCurrency = null;

    @JsonProperty("TargetCurrency")
    private String targetCurrency = null;

    @JsonProperty("UnitCurrency")
    private String unitCurrency = null;

    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate = null;

    @JsonProperty("ContractIdentification")
    private String contractIdentification = null;

    @JsonProperty("QuotationDate")
    private String quotationDate = null;

    @JsonProperty("InstructedAmount")
    private OBCurrencyExchange5InstructedAmount instructedAmount = null;

}
