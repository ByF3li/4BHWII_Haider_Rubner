public class sumFunc {

    public static void main(String[] args) {
        int zahl = 6;

        System.out.println("Rekursiv " + sumFunctionRecursive(zahl));

        System.out.println("Iterativ " + sumFunctionIterative(zahl));




    }

    public static int sumFunctionRecursive(int number){

        if(number == 1){
            return number = 1;
        }
        else{
            return number = number + sumFunctionRecursive(number = number - 1);
        }
    }

    public static int sumFunctionIterative(int number){
        int num = 1;
        while(number > 1){
            num = num + number;
            number--;
        }
        return num;
    }


}