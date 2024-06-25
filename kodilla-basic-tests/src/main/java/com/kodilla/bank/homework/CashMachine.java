package com.kodilla.bank.homework;
import java.util.ArrayList;
import java.util.List;
public class CashMachine { //wygenerowane przez GPT
    private List<Integer> transactions;

    public CashMachine() {
        this.transactions = new ArrayList<>();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            transactions.add(-amount);
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getTransactionCount() {
        return transactions.size();
    }

    public List<Integer> getTransactions() {
        return transactions;
    }
}


