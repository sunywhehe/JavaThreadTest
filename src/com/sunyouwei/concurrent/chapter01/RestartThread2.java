package com.sunyouwei.concurrent.chapter01;

import java.util.concurrent.TimeUnit;

public class RestartThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

        try {
            //休眠主要是确保thread 结束生命周期
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.start();//企图重新激活该线程
    }
}
