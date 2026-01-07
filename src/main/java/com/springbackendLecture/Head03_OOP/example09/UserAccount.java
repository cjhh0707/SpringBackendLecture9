package com.springbackendLecture.Head03_OOP.example09;

public class UserAccount {
    private final String accountId;
    private double balance;

    public UserAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public String getAccountId() {
        return accountId;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be greater than 0");
        balance += amount;

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("출금 금액은 0보다 커야 합니다.");
        }
        if (balance < amount) {
            throw new IllegalStateException("잔액 부족: 현재 잔액 = " + balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
