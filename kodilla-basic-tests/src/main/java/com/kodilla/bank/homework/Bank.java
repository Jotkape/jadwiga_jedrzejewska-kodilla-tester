package com.kodilla.bank.homework;
import java.util.ArrayList;
import java.util.List;
public class Bank { //wygenerowane przez GPT
    private List<CashMachine> cashMachines;

    public Bank() {
        this.cashMachines = new ArrayList<>();
    }

    public void addCashMachine(CashMachine cashMachine) {
        cashMachines.add(cashMachine);
    }

    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdrawTransactionCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getDepositTransactionCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double getAverageWithdrawal() {
        int sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public double getAverageDeposit() {
        int sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}
