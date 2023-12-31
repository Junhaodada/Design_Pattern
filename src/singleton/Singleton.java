package singleton;

/**
 * 更好的单例模式实现
 * Initialization on Demand Holder（IoDH）的技术
 * 通过使用IoDH，既可以实现延迟加载，又可以保证线程安全，不影响系统性能。因此，IoDH不失为一种最好的Java语言单例模式实现方式；其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH。
 */
public class Singleton {
    private Singleton() {
    }

    // 静态内部类负责创建实例
    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);// true
    }

}
