package com.sunyouwei.concurrent.chapter10;

public class NameSpace {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = NameSpace.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("com.sunyouwei.concurrent.chapter10.MyClassLoaderTest");
        Class<?> bClass = classLoader.loadClass("com.sunyouwei.concurrent.chapter10.MyClassLoaderTest");
        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass == bClass);


        MyClassLoader classLoader1 = new MyClassLoader("C:\\classloader1", null);
        BrokerDelegateClassLoader classLoader2 = new BrokerDelegateClassLoader("C:\\classloader1", null);
        Class<?> cClass = classLoader1.loadClass("com.sunyouwei.concurrent.chapter10.MyClassLoaderTest");
        Class<?> dClass = classLoader2.loadClass("com.sunyouwei.concurrent.chapter10.MyClassLoaderTest");
        System.out.println(cClass.getClassLoader());
        System.out.println(dClass.getClassLoader());
        System.out.println(cClass.hashCode());
        System.out.println(dClass.hashCode());
        System.out.println(cClass == dClass);
    }
}
