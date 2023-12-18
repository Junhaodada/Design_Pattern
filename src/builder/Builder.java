package builder;

/**
 * Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口。
 * 在该接口中一般声明两类方法：
 * 一类方法是buildPartX（），用于创建复杂对象的各个部件；
 * 另一类方法是getResult（），用于返回复杂对象。
 * Builder既可以是抽象类，也可以是接口。
 */
abstract class Builder {
    // 创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    // 返回产品对象
    public Product getResult() {
        return product;
    }
}

class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        // getResult().setPartA("A");
        System.out.println("构造A");
    }

    @Override
    public void buildPartB() {
        System.out.println("构造B");

    }

    @Override
    public void buildPartC() {
        System.out.println("构造C");

    }
}
