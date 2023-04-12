package FactoryPatternPizzeria;

public class PizzeriaTest {
    public static void main(String[] args) {
        Pizza salamiBerlin = PizzaFactory.getPizza(PizzaType.Salami, PizzeriaCity.Berlin);
        Pizza hawaiiBerlin = PizzaFactory.getPizza(PizzaType.Hawaii, PizzeriaCity.Berlin);
        Pizza calzoneBerlin = PizzaFactory.getPizza(PizzaType.Calzone, PizzeriaCity.Berlin);
        Pizza calzoneRostock = PizzaFactory.getPizza(PizzaType.Calzone, PizzeriaCity.Rostock);
        Pizza salamiHamburg = PizzaFactory.getPizza(PizzaType.Salami, PizzeriaCity.Hamburg);
        System.out.println(salamiBerlin);
        System.out.println(hawaiiBerlin);
        System.out.println(calzoneBerlin);
        System.out.println(calzoneRostock);
        System.out.println(salamiHamburg);
    }
}
