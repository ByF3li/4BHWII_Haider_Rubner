package FactoryPatternPizzeria;

public class Hamburg extends Pizzeria{
    private PizzeriaCity pizzeriaCity;

    public Hamburg(){
        this.pizzeriaCity = PizzeriaCity.Hamburg;
    }


    @Override
    public PizzeriaCity getPizzeria() {
        return this.pizzeriaCity;
    }
}
