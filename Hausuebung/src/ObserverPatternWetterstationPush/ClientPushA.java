package ObserverPatternWetterstationPush;

public class ClientPushA implements ClientPush {
    @Override
    public void update(int humidity, int temperature) {
        System.out.println("Client A:");
        System.out.println("Temperatur:" + temperature);
        System.out.println("Luftfeuchtigkeit: " + humidity);
        System.out.println();
    }
}
