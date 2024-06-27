package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines = new CashMachine[numberOfCashMachines + 1];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, numberOfCashMachines);
        newCashMachines[numberOfCashMachines] = cashMachine;
        cashMachines = newCashMachines;
        numberOfCashMachines++;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdrawTransactionCount() {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
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
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : sum / count;
    }

}

/*









}
 */

