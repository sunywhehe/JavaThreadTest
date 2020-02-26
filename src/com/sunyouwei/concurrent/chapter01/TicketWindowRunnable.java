package com.sunyouwei.concurrent.chapter01;

import java.util.concurrent.TimeUnit;

public class TicketWindowRunnable implements Runnable {

    private int index = 1;

    private final static int MAX = 50;

    @Override
    public void run() {
        while (index <= MAX) {
            System.out.println("柜台：" + Thread.currentThread() + "当前的号码是：" + (index++));
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
