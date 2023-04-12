package FactoryPatternPizzeria;

public class Calzone extends Pizza{
    private PizzaType pizzaType;
    private Pizzeria pizzeriaCity;

    public Calzone(PizzeriaCity city){
        this.pizzaType = PizzaType.Calzone;
        this.pizzeriaCity = PizzeriaFactory.getPizzeria(city);
    }

    @Override
    public String cookPizza() {
        return this.pizzaType + " " + this.pizzeriaCity;
    }
}
