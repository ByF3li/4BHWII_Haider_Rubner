package FactoryPatternPizzeria;

public class PizzaFactory {
    public static Pizza getPizza(PizzaType type, PizzeriaCity city){
        if(type == PizzaType.Salami){
            return new Salami(city);
        }
        else if(type == PizzaType.Calzone){
            return new Calzone(city);
        }
        else if(type == PizzaType.Hawaii){
            return new Hawaii(city);
        }
        return null;
    }
}
