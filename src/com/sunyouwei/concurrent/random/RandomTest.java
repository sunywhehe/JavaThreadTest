package com.sunyouwei.concurrent.random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

        random = new Random(100);
        System.out.println(random.nextInt(10) + "," + random.nextInt(30) + "," + random.nextInt(50));

    }
}
