package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OBRisk1DeliveryAddress {
    @JsonProperty("AddressLine")
    private List<String> addressLine = null;

    @JsonProperty("StreetName")
    private String streetName = null;

    @JsonProperty("BuildingNumber")
    private String buildingNumber = null;

    @JsonProperty("PostCode")
    private String postCode = null;

    @JsonProperty("TownName")
    private String townName = null;

    @JsonProperty("CountrySubDivision")
    private String countrySubDivision = null;

    @JsonProperty("Country")
    private String country = null;
}
