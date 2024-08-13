package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.transactions = new double[0];
        this.numberOfTransactions = 0;
    }

    public void addTransaction(double value) {
        double[] newTransactions = new double[numberOfTransactions + 1];
        System.arraycopy(transactions, 0, newTransactions, 0, numberOfTransactions);
        newTransactions[numberOfTransactions] = value;
        transactions = newTransactions;
        numberOfTransactions++;
    }

    public double getBalance() {
        double balance = 0;
        for (double transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public double getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public double[] getTransactions() {
        return transactions;
    }
}

