package org.xpdojo.bank;

public class Account {
    public int balance;

    public int accountNumber;

    public Account(int i) {
        accountNumber = i;
    }

    public Account() {
    new Account(123);
    }

    public  void deposit(int i) {
        balance += i;
    }

    public int withdrawal(int i) {

        balance -= i;
        if (balance>i){
            return i;
        }else{
            return 0;
        }

    }

    public boolean transferAmount(Account acc1, Account acc2, int i) {
        acc1.deposit(acc2.withdrawal(i));
        return true;

    }
}
