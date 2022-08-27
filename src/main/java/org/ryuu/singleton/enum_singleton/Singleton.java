package org.ryuu.singleton.enum_singleton;

public enum Singleton {
    INSTANCE;

    Singleton() {
        System.out.println(Singleton.class + " init");
    }

    public static void testStaticMethod() {
        System.out.println(Singleton.class + " test static method");
    }
}