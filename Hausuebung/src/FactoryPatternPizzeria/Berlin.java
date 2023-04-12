package FactoryPatternPizzeria;

public class Berlin extends Pizzeria{
    private PizzeriaCity pizzeriaCity;

    public Berlin(){
        this.pizzeriaCity = PizzeriaCity.Berlin;
    }

    @Override
    public PizzeriaCity getPizzeria() {
        return this.pizzeriaCity;
    }
}
