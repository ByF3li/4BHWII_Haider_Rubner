package StrategyPattern;

public class SeniorTicket implements Ticket {
    private double tax = 4.5;
    private double price = 19.90;

    @Override
    public double calcPrice() {
        return (tax+price);
    }
}
