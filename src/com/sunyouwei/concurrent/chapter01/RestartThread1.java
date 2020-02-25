package com.sunyouwei.concurrent.chapter01;

import java.util.concurrent.TimeUnit;

public class RestartThread1 {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();//启动线程

        thread.start();//再次启动
    }
}
