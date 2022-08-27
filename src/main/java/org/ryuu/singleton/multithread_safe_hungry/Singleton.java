package org.ryuu.singleton.multithread_safe_hungry;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println(Singleton.class + " init");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void testStaticMethod() {
        System.out.println(Singleton.class + " test static method");
    }
}