package com.openbanking.spec.obsaccountinfo.controller;

import com.openbanking.spec.obsaccountinfo.dto.getTransactionResponse.OBReadTransaction6;
import com.openbanking.spec.obsaccountinfo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/accounts/{account_id}/transactions")
    public ResponseEntity<OBReadTransaction6> getTransactionsByAccountId(
            @PathVariable(value = "account_id") String accountId) {
        return ResponseEntity.ok(transactionService.getTransactionsByAccountId(accountId));
    }

}
