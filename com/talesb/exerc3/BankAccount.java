package com.talesb.exerc3;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Depósito de " + amount + " realizado. Novo saldo: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Saque de " + amount + " realizado. Novo saldo: " + balance);
        } else {
            System.out.println("Saldo insuficiente para saque de " + amount);
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}
