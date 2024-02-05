package com.talesb.exerc2;

public class IncrementThreadWithSynchronization extends Thread {
    private static int sharedVariable = 0;

    public void run() {
        synchronized (IncrementThreadWithSynchronization.class) {
            for (int i = sharedVariable; i < 20000; i++) {
                sharedVariable++;
            }
        }
    }

    public static int getSharedVariable() {
        return sharedVariable;
    }
}