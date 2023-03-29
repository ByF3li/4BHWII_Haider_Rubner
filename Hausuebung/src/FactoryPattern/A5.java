package FactoryPattern;

public class A5 extends Briefumschläge {

    private String weight;

    public A5(String weight){
        this.weight=weight;
    }


    @Override
    public String getWeight() {
        return this.weight;
    }
}
