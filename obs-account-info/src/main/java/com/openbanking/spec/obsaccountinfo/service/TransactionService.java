package com.openbanking.spec.obsaccountinfo.service;

import com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse.OBReadTransaction6;

public interface TransactionService {
    OBReadTransaction6 getTransactionsByAccountId(String accountId);
}
