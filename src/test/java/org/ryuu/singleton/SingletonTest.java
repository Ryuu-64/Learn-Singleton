package org.ryuu.singleton;

import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    void staticMethod() {
        org.ryuu.singleton.double_check_lock.Singleton.testStaticMethod();
        org.ryuu.singleton.enum_singleton.Singleton.testStaticMethod();
        org.ryuu.singleton.lazy.Singleton.testStaticMethod();
        org.ryuu.singleton.multithread_safe_hungry.Singleton.testStaticMethod();
        org.ryuu.singleton.multithread_unsafe_hungry.Singleton.testStaticMethod();
        org.ryuu.singleton.static_class.Singleton.testStaticMethod();
    }
}
