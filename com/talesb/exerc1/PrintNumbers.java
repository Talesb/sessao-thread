package com.talesb.exerc1;

public class PrintNumbers extends Thread{

    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
    }

}
