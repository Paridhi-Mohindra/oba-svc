package com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Meta {
    @JsonProperty("TotalPages")
    private Integer totalPages = null;

    @JsonProperty("FirstAvailableDateTime")
    private String firstAvailableDateTime = null;

    @JsonProperty("LastAvailableDateTime")
    private String lastAvailableDateTime = null;
}
