package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = new Account(1234);
        account.deposit(10);
        assertThat(account.balance).isEqualTo(10);
    }

    @Test
    public void openingAccount() {

        Account account = new Account();
        account.deposit(10);
        assertThat(account.balance).isEqualTo(10);
    }

    @Test
    public void withdrawal(){

        Account account = new Account(123);
        account.withdrawal(10);
        assertThat(account.balance).isEqualTo(-10);

    }

    @Test
    public void transferAmount(){
        Account acc1 = new Account(123);
        Account acc2 = new Account(234);
        acc1.deposit(acc2.withdrawal(100));
        assertThat(acc1.balance).isEqualTo(100);
    }

    @Test
    public void printAccountBalance(){
        Account acc = new Account(2345);
        assertThat(acc.balance).isEqualTo(0);
    }


}
