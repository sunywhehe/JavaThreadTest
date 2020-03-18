package com.sunyouwei.concurrent.chapter09;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SingletonClassInit {

    static {
        try {
            System.out.println("The ClassInit static code block will be invoke.");
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream.range(0, 5).forEach(i -> new Thread(SingletonClassInit::new));
    }
}
