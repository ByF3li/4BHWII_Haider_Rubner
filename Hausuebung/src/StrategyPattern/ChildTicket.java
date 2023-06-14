package StrategyPattern;

public class ChildTicket implements Ticket{
    private double tax = 2.3;
    private double price = 9.99;


    @Override
    public void calcPrice() {
        System.out.println("Kinderticket: " + (tax+price));
    }
}
