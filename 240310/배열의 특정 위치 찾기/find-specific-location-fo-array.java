import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        
        int evenSum = 0;

        int sumMo3 = 0;

        int countMo3 = 0;
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if((i+1) % 2 == 0){
                evenSum += arr[i];
            }
            
            if((i+1)%3 == 0){
                sumMo3 += arr[i]; 
                countMo3++;
            }
        }
        System.out.printf("%d %.1f", evenSum, (double) sumMo3/countMo3);
    }
}