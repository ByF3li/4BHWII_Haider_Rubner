public class EndRekursion {
    public static void main(String[] args) {

        int zahl = 6;
        System.out.println("Die Fakultät der Zahl " + zahl + " ist: " + fakEndRek(1,zahl));

    }

    public static int fakEndRek(int a, int zahl){
        if(zahl == 0){
            return a;
        }else{
            return fakEndRek(a * zahl,zahl - 1);
        }
    }

}
