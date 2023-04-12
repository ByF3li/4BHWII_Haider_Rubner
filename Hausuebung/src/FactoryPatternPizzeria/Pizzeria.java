package FactoryPatternPizzeria;

public abstract class Pizzeria {
    public abstract PizzeriaCity getPizzeria();

    @Override
    public String toString(){
        return "Pizzeria: " + this.getPizzeria();
    }
}
