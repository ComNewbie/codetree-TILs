import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.next().length();
        }

        int max = arr[0];

        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.print(max - min);

    }
}