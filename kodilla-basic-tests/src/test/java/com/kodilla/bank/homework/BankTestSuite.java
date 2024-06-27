package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    private Bank bank;
    private CashMachine cm1;
    private CashMachine cm2;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
        cm1 = new CashMachine();
        cm2 = new CashMachine();
    }

    @Test
    public void testAddCashMachine() {
        bank.addCashMachine(cm1);
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void testTotalBalance() {
        cm1.addTransaction(500);
        cm1.addTransaction(-200);
        cm2.addTransaction(1000);
        cm2.addTransaction(-500);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(800, bank.getTotalBalance());
    }

    @Test
    public void testWithdrawTransactionCount() {
        cm1.addTransaction(-200);
        cm2.addTransaction(-500);
        cm2.addTransaction(-100);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(3, bank.getWithdrawTransactionCount());
    }

    @Test
    public void testDepositTransactionCount() {
        cm1.addTransaction(500);
        cm2.addTransaction(1000);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(2, bank.getDepositTransactionCount());
    }

    @Test
    public void testAverageWithdrawal() {
        cm1.addTransaction(-200);
        cm2.addTransaction(-500);
        cm2.addTransaction(-100);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(-266.6666666666667, bank.getAverageWithdrawal(), 0.0001);
    }

    @Test
    public void testAverageDeposit() {
        cm1.addTransaction(500);
        cm2.addTransaction(1000);

        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(750, bank.getAverageDeposit(), 0.0001);
    }

    @Test
    public void testNoWithdrawals() {
        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(0, bank.getAverageWithdrawal(), 0.0001);
    }

    @Test
    public void testNoDeposits() {
        bank.addCashMachine(cm1);
        bank.addCashMachine(cm2);

        assertEquals(0, bank.getAverageDeposit(), 0.0001);
    }
}