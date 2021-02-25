package com.openbanking.spec.obsaccountinfo.service;

import com.openbanking.spec.obsaccountinfo.dto.OBReadAccount6;
import com.openbanking.spec.obsaccountinfo.dto.OBReadBalance1;

public interface AccountService {

	OBReadAccount6 getAccounts();

	OBReadBalance1 getBalances();
	
}
