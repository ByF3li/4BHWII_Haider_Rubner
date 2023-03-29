package FactoryPattern;

public class A4 extends Briefumschläge{

    private String weight;

    public A4(String weight){
        this.weight=weight;
    }

    @Override
    public String getWeight() {
        return this.weight;
    }
}
