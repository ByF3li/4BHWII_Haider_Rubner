package FactoryPatternPizzeria;

public class Rostock extends Pizzeria{
    private PizzeriaCity pizzeriaCity;

    public Rostock(){
        this.pizzeriaCity = PizzeriaCity.Rostock;
    }

    @Override
    public PizzeriaCity getPizzeria() {
        return this.pizzeriaCity;
    }
}
