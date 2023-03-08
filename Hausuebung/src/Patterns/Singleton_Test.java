package Patterns;

public class Singleton_Test {
    public static void main(String[] args) {
        Drucker drucker = Drucker.getDrucker();
        System.out.println("Ich drucke,ich bin der Drucker: " + drucker);
        Drucker drucker2 = Drucker.getDrucker();
        System.out.println("Ich drucke,ich bin der Drucker: " + drucker2);
    }
}
