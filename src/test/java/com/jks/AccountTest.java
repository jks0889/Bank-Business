package com.jks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;

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
        assertThat(10000, is(account.getBalance()));

        account = new Account(1000);
        assertThat(1000, is(account.getBalance()));

        account = new Account(0);
        assertThat(0,is(account.getBalance()));
    }

    @Test
    public void testDeposit() throws  Exception{
        Account account = new Account(10000);
        account.deposit(1000);
        assertThat(11000,is(account.getBalance()));
    }

    @Test
    public void testWithdraw() throws  Exception{
        account.withdraw(1000);
        assertThat(9000,is(account.getBalance()));
    }
}
