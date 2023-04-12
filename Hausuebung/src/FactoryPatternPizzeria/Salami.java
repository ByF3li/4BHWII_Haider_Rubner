package FactoryPatternPizzeria;

public class Salami extends Pizza{
    private PizzaType pizzaType;
    private Pizzeria pizzeriaCity;

    public Salami(PizzeriaCity city){
        this.pizzaType = PizzaType.Salami;
        this.pizzeriaCity = PizzeriaFactory.getPizzeria(city);
    }

    @Override
    public String cookPizza() {
        return this.pizzaType + " " + this.pizzeriaCity;
    }
}
