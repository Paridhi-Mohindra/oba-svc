package com.openbanking.spec.obsaccountinfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.openbanking.spec.obsaccountinfo.dto.OBAccount4Account;
import com.openbanking.spec.obsaccountinfo.dto.OBAccount6;
import com.openbanking.spec.obsaccountinfo.dto.OBAccountStatus1Code;
import com.openbanking.spec.obsaccountinfo.dto.OBBalanceType1Code;
import com.openbanking.spec.obsaccountinfo.dto.OBCreditDebitCode2;
import com.openbanking.spec.obsaccountinfo.dto.OBExternalAccountSubType1Code;
import com.openbanking.spec.obsaccountinfo.dto.OBExternalAccountType1Code;
import com.openbanking.spec.obsaccountinfo.dto.OBReadAccount6;
import com.openbanking.spec.obsaccountinfo.dto.OBReadAccount6Data;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1Data;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1DataAmount;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1DataBalance;
import com.openbanking.spec.obsaccountinfo.dto.external.AccountBalance;
import com.openbanking.spec.obsaccountinfo.dto.external.OBPAccountsDto;
import com.openbanking.spec.obsaccountinfo.dto.external.OBPBalancesDto;
import com.openbanking.spec.obsaccountinfo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${obp.header.authorization}")
	private String authorizationHeader;

	@Value("${obp.url.base}")
	private String baseUrl;

	@Override
	public OBReadAccount6 getAccounts() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Authorization", authorizationHeader);

		HttpEntity entity = new HttpEntity(httpHeaders);

		String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/accounts").toUriString();

		ResponseEntity<OBPAccountsDto[]> obpAccountsDto = restTemplate.exchange(url, HttpMethod.GET, entity,
				OBPAccountsDto[].class);
		OBPAccountsDto[] responseArray = obpAccountsDto.getBody();

		List<OBAccount6> obAccount6List = new ArrayList<>();
		for (int i = 0; i < responseArray.length; i++) {
			List<OBAccount4Account> obaccount4accountList = new ArrayList();
			obaccount4accountList.add(OBAccount4Account.builder().name("John Doe").schemeName("Regular")
					.secondaryIdentification("John D").build());
			obAccount6List
					.add(OBAccount6.builder().accountId(responseArray[i].getId()).status(OBAccountStatus1Code.ENABLED)
							.currency("EUR").accountType(OBExternalAccountType1Code.PERSONAL)
							.accountSubType(OBExternalAccountSubType1Code.CURRENTACCOUNT).openingDate("11-01-2021")
							.maturityDate("NA").nickname("John").account(obaccount4accountList).build());
		}

		return OBReadAccount6.builder().data(OBReadAccount6Data.builder().account(obAccount6List).build()).build();

	}

	@Override
	public OBReadBalance1 getBalances() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Authorization", authorizationHeader);

		HttpEntity entity = new HttpEntity(httpHeaders);
		String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/balances").toUriString();

		ResponseEntity<OBPBalancesDto> obpBalancesDto = restTemplate.exchange(url, HttpMethod.GET, entity,
				OBPBalancesDto.class);

		List<OBReadBalance1DataBalance> obReadBalance1DataBalancList = new ArrayList<>();
		for (AccountBalance accountBalances : obpBalancesDto.getBody().getAccountBalances()) {
			OBReadBalance1DataBalance obReadBalance1DataBalance = OBReadBalance1DataBalance.builder()
					.accountId(accountBalances.getAccountId())
					.type(OBBalanceType1Code.CLOSINGAVAILABLE)
					.creditDebitIndicator(OBCreditDebitCode2.CREDIT)
					.dateTime("2020-12-14T03:52:30.864Z")
					.amount(OBReadBalance1DataAmount.builder()
							.amount(accountBalances.getBalances().get(0).getAmount())
							.currency(accountBalances.getBalances().get(0).getCurrency())
							.build())
					.build(); 
			obReadBalance1DataBalancList.add(obReadBalance1DataBalance);
		}
		return OBReadBalance1.builder()
				.data(OBReadBalance1Data.builder()
						.balance(obReadBalance1DataBalancList)
						.build())
				.build();

//		return OBReadBalance1.builder().data(OBReadBalance1Data.builder().balance(obReadBalance1Data).build()).build();
	}

}
