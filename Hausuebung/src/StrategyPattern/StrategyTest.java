package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Ticket child = new ChildTicket();
        cart.addShoppingCart(child);

        Ticket adult = new AdultTicket();
        cart.addShoppingCart(adult);

        Ticket senior = new SeniorTicket();
        cart.addShoppingCart(senior);

        System.out.println("Total: " + cart.calcTotal());
    }
}
