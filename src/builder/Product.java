package builder;

/**
 * Product（产品角色）：它是被构建的复杂对象，包含多个组成部件。具体建造者创建该产品的内部表示并定义其装配过程。
 */
class Product {
    private String partA;   // 定义部件，可以是值类型或引用类型
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
