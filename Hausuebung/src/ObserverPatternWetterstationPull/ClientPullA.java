package ObserverPatternWetterstationPull;

public class ClientPullA implements ClientPull {
    @Override
    public void update(Wetter wetter) {
        System.out.println("Client A:");
        System.out.println("Temperatur:" + wetter.getTemperature());
        System.out.println("Luftfeuchtigkeit: " + wetter.getHumidity());
        System.out.println();
    }
}
