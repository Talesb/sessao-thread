package com.talesb.exerc3;

public class Main {

    //Crie uma classe que represente uma conta bancária com um saldo inicial. Crie duas threads para realizar saques e depósitos concorrentes na conta, garantindo a consistência do saldo.
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Threads para realizar saques
        Thread withdrawThread1 = new Thread(() -> {
            account.withdraw(500);
        });

        Thread withdrawThread2 = new Thread(() -> {
            account.withdraw(700);
        });

        // Threads para realizar depósitos
        Thread depositThread1 = new Thread(() -> {
            account.deposit(300);
        });

        Thread depositThread2 = new Thread(() -> {
            account.deposit(400);
        });

        // Inicia as threads
        withdrawThread1.start();
        withdrawThread2.start();
        depositThread1.start();
        depositThread2.start();

        // Espera todas as threads terminarem
        try {
            withdrawThread1.join();
            withdrawThread2.join();
            depositThread1.join();
            depositThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtém e imprime o saldo final da conta
        System.out.println("Saldo final: " + account.getBalance());
    }
}
