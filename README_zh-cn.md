# Learn-Singleton

## 简述

单例 (Singleton) 模式提供一个可以全局访问的实例，并保证该类仅有一个实例。

设计模式类型：创建型

## 实现

### 1.懒汉 多线程不安全

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 2.懒汉 多线程安全

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 3.双检锁

```java
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
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
}
```

### 4.饿汉

```java
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }
}
```

### 5.静态内部类

```java
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```

### 6.枚举

```java
public enum Singleton {
    INSTANCE;
}
```

## 选择

不建议使用：
1 懒汉 多线程不安全 (不安全)
2 懒汉 多线程安全 (性能太低)

单例是派生类，使用可能性大：
4 饿汉

单例是派生类，使用可能性小 (懒加载)：
3 双检锁 (实现复杂)
5 静态内部类 (类数量增加)

不考虑继承：
6 枚举 (静态方法触发加载)