package com.anastasisgi.bankaccountjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void withdraw_returnsTrue_ifEnoughFunds() {
        BankAccount account = new BankAccount(500);
        assertTrue(account.withdraw(100));
    }

    @Test
    public void deposit_an_amount() {
        BankAccount account = new BankAccount(500);
        account.deposit(500);
        assertEquals(account.getBalance(), 1000);
    }

}