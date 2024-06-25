package com.kodilla.bank.homework;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class CashMachineTestSuite { //wygenerowane przez GPT

        private CashMachine cashMachine;

        @BeforeEach
        public void setUp() {
            cashMachine = new CashMachine();
        }

        @Test
        public void testDeposit() {
            cashMachine.deposit(500);
            assertEquals(500, cashMachine.getBalance());
            assertEquals(1, cashMachine.getTransactionCount());
        }

        @Test
        public void testWithdraw() {
            cashMachine.withdraw(200);
            assertEquals(-200, cashMachine.getBalance());
            assertEquals(1, cashMachine.getTransactionCount());
        }

        @Test
        public void testMultipleTransactions() {
            cashMachine.deposit(500);
            cashMachine.withdraw(200);
            cashMachine.deposit(300);

            assertEquals(600, cashMachine.getBalance());
            assertEquals(3, cashMachine.getTransactionCount());
        }

        @Test
        public void testNoTransactions() {
            assertEquals(0, cashMachine.getBalance());
            assertEquals(0, cashMachine.getTransactionCount());
        }
    }
