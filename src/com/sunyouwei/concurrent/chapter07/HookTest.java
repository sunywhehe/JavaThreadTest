package com.sunyouwei.concurrent.chapter07;

public class HookTest {
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("hook event 1");
        }, "hook thread 1"));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("hook event 2");
        }, "hook thread 2"));

        System.out.println("main thread exit");
    }
}
