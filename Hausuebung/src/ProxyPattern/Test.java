package ProxyPattern;

public class Test {
    public static void main(String[] args) {
        Drucker drucker = new ProxyDrucker();

        drucker.drucken(24);
    }
}
