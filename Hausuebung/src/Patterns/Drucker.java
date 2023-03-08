package Patterns;

public class Drucker {
    private volatile static Drucker drucker;
    private Drucker() {}
    public static Drucker getDrucker() {
        if (drucker == null) {
            synchronized (Drucker.class) {
                if (drucker == null) {
                    drucker = new Drucker();
                }
            }
        }
        return drucker;
    }
}
