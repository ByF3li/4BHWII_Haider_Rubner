public class CharAlgo {

    public static int binarySearch(char array[], char ges, int low, int high){
        while(low <= high){
            int mid = low + (high-low) / 2;

            if( (int)array[mid] == (int)ges){
                return mid;
            }
            if((int)array[mid] < ges){
                low = mid + 1;
            }else {
                low = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        char array[] = {'a','b','g','h','j'};
        char ges = 'l';
        int high = array.length-1;
        int result = binarySearch(array,ges,0,high);
        if(result == -1) {
            System.out.println("not found!");
        }else{
            System.out.println("Elsement found at index: " + result);
        }
    }
}
