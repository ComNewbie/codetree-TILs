import java.util.*;

public class Main {   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int min = 99;

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] - arr[i] < min){
                    min = arr[j] - arr[i];
                }
            }
        }

        System.out.print(min);
    }
}