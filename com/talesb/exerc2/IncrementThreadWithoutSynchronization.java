package com.talesb.exerc2;

public class IncrementThreadWithoutSynchronization extends Thread {
    private static int sharedVariable = 0;

    public void run() {
        //race condition
        for (int i = sharedVariable; i < 20000; i++) {
            sharedVariable++;
        }
    }

    public static int getSharedVariable(){
        return sharedVariable;
    }
}
