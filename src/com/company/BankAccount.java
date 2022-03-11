package com.company;

public class BankAccount {
    private int balance;

    public BankAccount () {
    }
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  void addMoney(int a) {
        balance += a;
    }
    public void takeMoney(int b) {
        balance -= b;
    }

    @Override
    public String toString() {
        return "Balance at bank account: $ " + balance+".";
    }

}
