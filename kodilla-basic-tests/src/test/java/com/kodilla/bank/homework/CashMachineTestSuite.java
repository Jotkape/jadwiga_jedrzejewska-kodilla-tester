package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CashMachineTestSuite {
    private CashMachine cashMachine;

    @BeforeEach
    public void setUp() {
        cashMachine = new CashMachine();
    }

    @Test
    public void testAddTransaction() {
        cashMachine.addTransaction(500);
        assertEquals(500, cashMachine.getBalance());
        assertEquals(1, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void testGetBalance() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(300);
        assertEquals(600, cashMachine.getBalance());
    }

    @Test
    public void testGetTransactions() {
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(300);
        double[] expected = {500, -200, 300};
        assertArrayEquals(expected, cashMachine.getTransactions());
    }

    @Test
    public void testNoTransactions() {
        assertEquals(0, cashMachine.getBalance());
        assertEquals(0, cashMachine.getNumberOfTransactions());
        assertArrayEquals(new double[0], cashMachine.getTransactions());
    }

}