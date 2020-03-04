package com.sunyouwei.concurrent.chapter07;

import java.util.concurrent.TimeUnit;

public class EmptyExceptionHandler {
    public static void main(String[] args) {
        //get current thread's thread group
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        System.out.println(group.getName());
        System.out.println(group.getParent());
        System.out.println(group.getParent().getParent());

        final Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {

            }

            System.out.println(1 / 0);
        }, "Test-Thread");

        thread.start();
    }
}
