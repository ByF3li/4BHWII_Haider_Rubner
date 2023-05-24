package ProxyPattern;

public class ProxyDrucker implements Drucker{

    private Drucker drucker = new RealDrucker();

    @Override
    public void drucken(int seitenanzahl) {
        if(seitenanzahl <= 0){
            System.out.println("Konnte nicht Drucken! Zu wenig Seiten");
        }
        else if(seitenanzahl >= 0 && seitenanzahl < 50){
            System.out.println("Seiten werden mit Farbe gedruckt");
            drucker.drucken(seitenanzahl);
        }
        else if(seitenanzahl >= 50 && seitenanzahl <= 500){
            System.out.println("Seiten werden Schwarz/Weiß gedruckt");
            drucker.drucken(seitenanzahl);
        }
        else {
            System.out.println("Konnte nicht Drucken! Zu viele Seiten");
        }
    }
}
