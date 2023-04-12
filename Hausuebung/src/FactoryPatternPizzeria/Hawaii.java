package FactoryPatternPizzeria;

public class Hawaii extends Pizza{
    private PizzaType pizzaType;
    private Pizzeria pizzeriaCity;

    public Hawaii(PizzeriaCity city){
        this.pizzaType = PizzaType.Hawaii;
        this.pizzeriaCity = PizzeriaFactory.getPizzeria(city);
    }

    @Override
    public String cookPizza() {
        return this.pizzaType + " " + this.pizzeriaCity;
    }
}
