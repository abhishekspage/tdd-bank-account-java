package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertThat;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance,is(100));
    }

    @Test
    public void openingAccount() {

        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance,is(10));
    }

    @Test
    public void withdrawal(){

    }



}
