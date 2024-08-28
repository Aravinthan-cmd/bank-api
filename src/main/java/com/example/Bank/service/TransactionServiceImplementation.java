package com.example.Bank.service;

import com.example.Bank.entity.Transaction;
import com.example.Bank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TransactionServiceImplementation implements TransactionService {

    @Autowired
    TransactionRepository repository;

    @Override
    public Transaction transfer(Transaction transaction) {
        Transaction transaction_saved = repository.save(transaction);
        return transaction_saved;
    }

    @Override
    public Transaction getTransactionById(Long transactionId) {
        Optional<Transaction> transaction = repository.findById(transactionId);
        if (transaction.isEmpty()) {
            throw new RuntimeException("Account is not present");
        }
        Transaction transaction_found = transaction.get();
        return transaction_found;
    }

    @Override
    public List<Transaction> getAllTransaction() {
        List<Transaction> listOfTransaction = repository.findAll();
        return listOfTransaction;
    }

}
