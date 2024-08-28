package com.example.Bank.entity;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String description;
    @Column
    private Double amount;
    @Column
    private String time;

    public Transaction() {
    }

    public Transaction( String description, Double amount, String time) {
        this.description = description;
        this.amount = amount;
        this.time = time;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction_id=" + transaction_id +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", time=" + time +
                '}';
    }

}
