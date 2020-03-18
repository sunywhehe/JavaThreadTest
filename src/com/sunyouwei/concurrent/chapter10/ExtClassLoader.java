package com.sunyouwei.concurrent.chapter10;

public class ExtClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(System.getProperty("java.ext.dirs"));

        Class<?> helloClass = Class.forName("com.sunyouwei.concurrent.chapter09.SingletonClassInit");
        System.out.println(helloClass.getClassLoader());
    }
}
