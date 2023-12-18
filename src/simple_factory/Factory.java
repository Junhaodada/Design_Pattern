package simple_factory;

/**
 * 简单工厂类
 * 提供一个静态方法负责创建对象
 */
class Factory {
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            // 初始化设置product
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            // 初始化设置product
        }
        return product;
    }
}

class Client {
    public static void main(String[] args) {
        Product product;
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}