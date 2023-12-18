package simple_factory;

/**
 * 抽象产品类
 * 负责实现共有方法
 * 声明抽象方法
 */
abstract class Product {
    public void methodSame() {
        // 共有方法的实现
        System.out.println("Same");
    }

    // 声明抽象业务方法
    public abstract void methodDiff();
}

class ConcreteProductA extends Product {
    // 实现业务方法
    @Override
    public void methodDiff() {
        // 实现业务
        System.out.println("Diff A");
    }
}

class ConcreteProductB extends Product {
    // 实现业务方法
    @Override
    public void methodDiff() {
        // 实现业务
        System.out.println("Diff B");
    }
}