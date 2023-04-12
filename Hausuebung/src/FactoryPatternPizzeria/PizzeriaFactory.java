package FactoryPatternPizzeria;

public class PizzeriaFactory {
    public static Pizzeria getPizzeria(PizzeriaCity city){
        if(city == PizzeriaCity.Berlin){
            return new Berlin();
        }
        else if(city == PizzeriaCity.Hamburg){
            return new Hamburg();
        }
        else if(city == PizzeriaCity.Rostock){
            return new Rostock();
        }
        return null;
    }
}
