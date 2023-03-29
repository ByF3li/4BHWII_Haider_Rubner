package FactoryPattern;

public abstract class Briefumschläge {
    public abstract String getWeight();

    @Override
    public String toString(){
        return "Weight: " + this.getWeight();
    }
}
