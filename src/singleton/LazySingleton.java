package singleton;


/**
 * 懒汉式单例类与线程锁定
 * 该懒汉式单例类在getInstance（）方法前面增加了关键字synchronized进行线程锁定，以处理多个线程同时访问的问题。
 * 上述代码虽然解决了线程安全问题，但是每次调用getInstance（）时都需要进行线程锁定判断，
 * 在多线程高并发访问环境中，将会导致系统性能大大降低。
 */
class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    // 延迟加载
    // 懒汉式单例在第一次调用getInstance（）方法时实例化，在类加载时并不自行实例化，
    // 这种技术又称为延迟加载（Lazy Load）技术，即需要的时候再加载实例。
    // 为了避免多个线程同时调用getInstance（）方法，可以使用关键字synchronized
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // 被volatile修饰的成员变量可以确保多个线程都能够正确处理
    private volatile static LazySingleton instance2 = null;

    // 双重检查锁定（Double-Check Locking）
    public static LazySingleton getInstance2() {
        if (instance2 == null) {
            synchronized (LazySingleton.class) {
                if (instance2 == null) {
                    instance2 = new LazySingleton();
                }
            }
        }
        return instance2;
    }
}
