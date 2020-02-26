package com.sunyouwei.concurrent.chapter04;

import java.util.HashMap;

public class HashMapDeadLock {

    private final HashMap<String, String> map = new HashMap<>();

    public void add(String key, String value) {
        this.map.put(key, value);
    }

    public static void main(String[] args) {
        final HashMapDeadLock deadLock = new HashMapDeadLock();
        for (int x = 0; x < 2; x++) {
            new Thread(() -> {
                for (int i = 1; i < Integer.MAX_VALUE; i++) {
                    deadLock.add(String.valueOf(i), String.valueOf(i));
                }
            }).start();
        }
    }
}
