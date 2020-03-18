package com.sunyouwei.concurrent.chapter09;

public class Singleton {

    // ①
    private static int x = 0;
    private static int y;
    private static Singleton instance = new Singleton();//②

    private Singleton() {
        x++;
        y++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.x);
        System.out.println(singleton.y);
    }
}
