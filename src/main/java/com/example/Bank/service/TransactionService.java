package com.example.Bank.service;

import com.example.Bank.entity.Transaction;

import java.util.List;

public interface TransactionService {

    public Transaction transfer(Transaction transaction);
    public Transaction getTransactionById(Long transactionId);
    public List<Transaction> getAllTransaction();

}
