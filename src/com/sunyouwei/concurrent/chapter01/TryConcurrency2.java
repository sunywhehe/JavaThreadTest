package com.sunyouwei.concurrent.chapter01;

import java.util.concurrent.TimeUnit;

public class TryConcurrency2 {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                enjoyMusic();
            }
        }.start();
        browseNews();
    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("Uh-huh, the good news.");
            sleep(1);
        }
    }

    private static void enjoyMusic() {
        for (; ; ) {
            System.out.println("Uh-huh, the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
