package com.sunyouwei.concurrent.random;

import java.util.SplittableRandom;

public class SplittableRandomTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("第一段");
        SplittableRandom random = new SplittableRandom(100);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SplittableRandom _random = random.split();
                for (int i = 0; i < 5; i++) {
                    System.out.println("---" + _random.nextInt(100));
                }
            }
        });
        thread.start();
        thread.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("+++" + random.nextInt(100));
        }

        System.out.println("第二段");
        SplittableRandom _random = new SplittableRandom(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("+++" + _random.nextInt(100));
        }
    }
}
