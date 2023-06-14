package SingletonPattern;

public class Drucker extends Object {
    private static Drucker drucker;
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
    public String toString(){
        return "Drucker";
    }
}
