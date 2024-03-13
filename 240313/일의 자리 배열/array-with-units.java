import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[2];

        for(int i=0;i<2;i++){
            arr[i] = scan.nextInt();
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<8;i++){
            int sum = arr[0] + arr[1];
            System.out.print(sum%10+" ");
            arr[0] = arr[1];
            arr[1] = (sum%10);
            
        }
        
    }
}