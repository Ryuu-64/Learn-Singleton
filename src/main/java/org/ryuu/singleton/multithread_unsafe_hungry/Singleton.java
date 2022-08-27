package org.ryuu.singleton.multithread_unsafe_hungry;

public class Singleton {
    public static Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println(Singleton.class + " init");
    }

    public static void testStaticMethod() {
        System.out.println(Singleton.class + " test static method");
    }
}