package StrategyPattern;

public class StrategyTest {
    public static void main(String[] args) {
        Ticket child = new ChildTicket();
        child.calcPrice();

        Ticket adult = new AdultTicket();
        adult.calcPrice();

        Ticket senior = new SeniorTicket();
        senior.calcPrice();
    }
}
