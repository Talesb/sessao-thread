package com.talesb.exerc2;

public class Main {
    public static void main(String[] args) {
        // Versão com Problema de Sincronização
//        IncrementThreadWithoutSynchronization thread1 = new IncrementThreadWithoutSynchronization();
//        IncrementThreadWithoutSynchronization thread2 = new IncrementThreadWithoutSynchronization();
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            //Aguarda as Threads acabarem
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Resultado sem sincronização: " + IncrementThreadWithoutSynchronization.getSharedVariable());

        // Versão com Sincronização Corrigida
        IncrementThreadWithSynchronization thread3 = new IncrementThreadWithSynchronization();
        IncrementThreadWithSynchronization thread4 = new IncrementThreadWithSynchronization();

        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resultado com sincronização: " + IncrementThreadWithSynchronization.getSharedVariable());
    }
}