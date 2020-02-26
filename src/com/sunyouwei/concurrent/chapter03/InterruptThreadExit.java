package com.sunyouwei.concurrent.chapter03;

import java.util.concurrent.TimeUnit;

public class InterruptThreadExit {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("I will start work");
                int i = 0;
                while (!isInterrupted()) {
                    //Working
                    i++;
                    System.out.println("I will start work :" + i);
                }

                System.out.println("I will be exiting.");
            }
        };

        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("System will be shutdown.");

        t.interrupt();
    }
}
