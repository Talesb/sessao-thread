package com.talesb.exerc4;

public class StarvationExample {

    public static void main(String[] args) {


        Thread lowPriorityThread = new Thread(() -> {
            synchronized (StarvationExample.class) {
                    System.out.println("Low Priority Thread");
            }
        });

        Thread highPriorityThread = new Thread(() -> {
            synchronized (StarvationExample.class) {
                System.out.println("High Priority Thread");

                int count  = 10000;
                 for(int i = 0; i < count; i++){
                     System.out.println("High Priority Thread: " + i);
                 }

            }
        });

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        highPriorityThread.start();


    }
}
