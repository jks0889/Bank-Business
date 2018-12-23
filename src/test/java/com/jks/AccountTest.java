package com.jks;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() {
        account = new Account(10000);
    }

    @Test
    public void testAccount() throws Exception {
    }

    @Test
    public void testGetBalance() throws Exception {
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() throws  Exception{
        Account account = new Account(10000);
        account.deposit(1000);
        assertEquals(11000,account.getBalance());
    }

    @Test
    public void testWithdraw() throws  Exception{
        account.withdraw(1000);
        assertEquals(9000,account.getBalance());
    }
}
