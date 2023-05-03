package ObserverPatternWetterstationPull;

public class ClientPullB implements ClientPull {
    @Override
    public void update(Wetter wetter) {
        System.out.println("Client B:");
        System.out.println("Temperatur:" + wetter.getTemperature());
        System.out.println("Luftfeuchtigkeit: " + wetter.getHumidity());
        System.out.println();
    }
}
