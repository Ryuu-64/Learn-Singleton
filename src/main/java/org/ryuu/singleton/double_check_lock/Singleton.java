package org.ryuu.singleton.double_check_lock;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
        System.out.println(Singleton.class + " init");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void testStaticMethod() {
        System.out.println(Singleton.class + " test static method");
    }
}