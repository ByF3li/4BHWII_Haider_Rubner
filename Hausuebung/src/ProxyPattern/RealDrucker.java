package ProxyPattern;

public class RealDrucker implements Drucker {

    @Override
    public void drucken(int seitenanzahl) {
        System.out.println("Es werden " + seitenanzahl + " Seiten gedruckt!");
    }
}
