package StrategyPattern;

public class AdultTicket implements Ticket {
    private double tax = 8.9;
    private double price = 25.90;
    @Override
    public void calcPrice() {
        System.out.println("Erwachsenenticket: " + (price+tax));
    }
}
