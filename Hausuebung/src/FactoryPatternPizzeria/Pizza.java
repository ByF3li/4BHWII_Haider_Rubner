package FactoryPatternPizzeria;

public abstract class Pizza {
    public abstract String cookPizza();

    @Override
    public String toString(){
        return "Pizza: " + this.cookPizza();
    }
}
