package FactoryPattern;

public class A6 extends Briefumschläge {
    private String weight;

    public A6(String weight){
        this.weight=weight;
    }

    @Override
    public String getWeight() {
        return this.weight;
    }
}
