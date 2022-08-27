package org.ryuu.singleton.static_class;

public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
        System.out.println(Singleton.class + " init");
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void testStaticMethod() {
        System.out.println(Singleton.class + " test static method");
    }
}