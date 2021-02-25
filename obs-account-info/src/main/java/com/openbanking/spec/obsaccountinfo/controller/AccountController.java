package com.openbanking.spec.obsaccountinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.openbanking.spec.obsaccountinfo.dto.OBReadAccount6;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1;
import com.openbanking.spec.obsaccountinfo.service.AccountService;

import io.swagger.annotations.ApiParam;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@io.swagger.annotations.ApiOperation(value = "Get Accounts", notes = "", response = OBReadAccount6.class, authorizations = {
			@io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
					@io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information") }) }, tags = {
							"Accounts", })
//	@io.swagger.annotations.ApiResponses(value = {
//			@io.swagger.annotations.ApiResponse(code = 200, message = "Accounts Read", response = OBReadAccount6.class),
//			@io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
//			@io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
//			@io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
//			@io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
//			@io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
//			@io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
//			@io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })
	@GetMapping("/accounts")
	public ResponseEntity<OBReadAccount6> getAccounts(
//			@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true) @RequestHeader("Authorization") String authorization,
//			@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC") @RequestHeader("x-fapi-auth-date") String xFapiAuthDate,
//			@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP.") @RequestHeader("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,
//			@ApiParam(value = "An RFC4122 UID used as a correlation id.") @RequestHeader("x-fapi-interaction-id") String xFapiInteractionId,
//			@ApiParam(value = "Indicates the user-agent that the PSU is using.") @RequestHeader("x-customer-user-agent") String xCustomerUserAgent
//			,@Context SecurityContext securityContext 
	) {
		return ResponseEntity.ok(accountService.getAccounts());
	}

	@io.swagger.annotations.ApiOperation(value = "Get Balances", notes = "", response = OBReadBalance1.class, authorizations = {
	        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
	            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
	        })
	    }, tags={ "Balances", })
//	    @io.swagger.annotations.ApiResponses(value = { 
//	        @io.swagger.annotations.ApiResponse(code = 200, message = "Balances Read", response = OBReadBalance1.class),
//	        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request", response = OBErrorResponse1.class),
//	        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
//	        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = OBErrorResponse1.class),
//	        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed", response = Void.class),
//	        @io.swagger.annotations.ApiResponse(code = 406, message = "Not Acceptable", response = Void.class),
//	        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
//	        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = OBErrorResponse1.class) })

	@GetMapping("/balances")
	public ResponseEntity<OBReadBalance1> getAccountsAccountIdBalances(
//			@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@RequestHeader("Authorization") String authorization
//			,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" )@RequestHeader("x-fapi-auth-date") String xFapiAuthDate
//			,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@RequestHeader("x-fapi-customer-ip-address") String xFapiCustomerIpAddress
//			,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@RequestHeader("x-fapi-interaction-id") String xFapiInteractionId
//			,@ApiParam(value = "Indicates the user-agent that the PSU is using." )@RequestHeader("x-customer-user-agent") String xCustomerUserAgent
//			,@Context SecurityContext securityContext
			){
	
	return ResponseEntity.ok(accountService.getBalances());
	}

	
	
}
