package org.xpdojo.bank;

public class Account {
    public int balance;

    public int accountNumber;

    public Account(int i) {
        accountNumber = i;
    }

    public void deposit(int i) {
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
}
