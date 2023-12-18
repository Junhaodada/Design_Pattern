package builder;

/**
 * 客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，
 * 并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。
 */
class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
    }
}
