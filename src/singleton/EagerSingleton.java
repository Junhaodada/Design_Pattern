package singleton;

/**
 * 饿汉式单例类
 * 在定义静态变量的时候实例化单例类，
 * 因此在类加载时就已经创建了单例对象
 */
class EagerSingleton {
    //
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
