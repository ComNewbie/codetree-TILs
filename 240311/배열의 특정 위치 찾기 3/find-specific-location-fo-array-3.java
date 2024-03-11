import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[100];

        int stop = 0;

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] == 0){
                break;
            }
            stop++;
        }

        for(int i=stop-1;i>=stop-3;i--){
            sum += arr[i];
        }

        System.out.print(sum);
    
    }
}