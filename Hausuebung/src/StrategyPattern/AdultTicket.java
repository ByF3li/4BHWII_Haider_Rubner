package StrategyPattern;

public class AdultTicket implements Ticket {
    private double tax = 8.9;
    private double price = 25.90;
    @Override
    public double calcPrice() {
         return (price+tax);
    }
}
