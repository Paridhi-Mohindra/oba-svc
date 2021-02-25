package com.openbanking.spec.obspaymentinitiation.service;

import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request.OBWriteDomestic2;
import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response.OBWriteDomesticResponse5;

import java.text.ParseException;

public interface PaymentService {

	OBWriteDomesticResponse5 createDomesticPayments(OBWriteDomestic2 obaRequestDTO) throws ParseException;
	
}
