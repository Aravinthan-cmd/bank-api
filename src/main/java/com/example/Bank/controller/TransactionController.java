package com.example.Bank.controller;

import com.example.Bank.entity.Transaction;
import com.example.Bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService service;

    @PostMapping("/transfer")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction createTransaction = service.transfer(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(createTransaction);
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransactionByTransferId(@PathVariable Long transactionId) {
        Transaction transaction = service.getTransactionById(transactionId);
        return transaction;
    }

    @GetMapping("/getalltransaction")
    public List<Transaction> getAllTransaction() {
        List<Transaction> transaction = service.getAllTransaction();
        return transaction;
    }

}
