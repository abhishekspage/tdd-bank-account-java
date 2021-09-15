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
        assertThat(account.balance);
    }

    @Test
    public void openingAccount() {

        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance);
    }

    @Test
    public void withdrawal(){

        Account account = new Account();
        account.withdrawal(10);
        assertThat(account.balance);

    }

    @Test
    public void transferAmount(){
        Account acc1 = new Account(123);
        Account acc2 = new Account(234);
        acc1.deposit(acc2.withdrawal(100));
        assertThat(acc1.balance);
    }

}
