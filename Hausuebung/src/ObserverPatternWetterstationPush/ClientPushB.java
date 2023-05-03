package ObserverPatternWetterstationPush;

public class ClientPushB implements ClientPush {
    @Override
    public void update(int humidity, int temperature) {
        System.out.println("Client B:");
        System.out.println("Temperatur:" + temperature);
        System.out.println("Luftfeuchtigkeit: " + humidity);
        System.out.println();
    }
}
