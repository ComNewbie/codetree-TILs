import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        int stop = 0;

        int evenSum = 0;

        int evneCount = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] == 0){
                break;
            }
            stop++;
        }

        for(int i=0;i<stop;i++){
            if(arr[i] % 2 == 0){
                evneCount++;
                evenSum += arr[i];
            }
           
        }

        System.out.printf("%d %d",evneCount,evenSum);
    }
}