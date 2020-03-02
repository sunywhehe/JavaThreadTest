package com.sunyouwei.concurrent.random;

import java.security.SecureRandom;

public class SecureRandomTest {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }
    }
}
