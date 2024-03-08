import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[10];
        int arr_sum = 0;

        for(int i=0; i<10;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<10;i++){
            arr_sum += arr[i];
        }

        System.out.print(arr_sum);

    }
}