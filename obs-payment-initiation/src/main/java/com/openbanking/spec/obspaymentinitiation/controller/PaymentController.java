package com.openbanking.spec.obspaymentinitiation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.openbanking.spec.obspaymentinitiation.service.PaymentService;
import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.request.OBWriteDomestic2;
import com.openbanking.spec.obspaymentinitiation.dto.internal.domesticPayments.response.OBWriteDomesticResponse5;

import java.text.ParseException;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping("/domestic-payments")
	public ResponseEntity<OBWriteDomesticResponse5> createDomesticPayments(
			@RequestBody
			OBWriteDomestic2 obaRequestDTO
	) throws ParseException {
		return ResponseEntity.ok(paymentService.createDomesticPayments(obaRequestDTO));
	}
	
	
}
