package ObserverPatternWetterstationPull;

public class WetterstationTest {
    public static void main(String[] args) {
        Wetter wetter = new Wetter();
        ClientPullA ca = new ClientPullA();
        ClientPullB cb = new ClientPullB();
        wetter.registerClient(ca);
        wetter.registerClient(cb);

        wetter.setHumidity(20);
        wetter.setTemperature(50);

        wetter.setHumidity(100);
        wetter.setTemperature(40);

        wetter.setHumidity(220);
        wetter.setTemperature(10);

    }
}
