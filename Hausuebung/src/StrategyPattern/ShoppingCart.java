package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Ticket> tickets = new ArrayList<>();

    public void addShoppingCart(Ticket ticket){
        tickets.add(ticket);
    }
    public double calcTotal(){
        double sum = 0;
        for(Ticket t : tickets){
            sum += t.calcPrice();
        }
        return sum;
    }
}
