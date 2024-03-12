import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        int evenThSum = 0;

        int oddThSum = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();

            if((i+1)%2 == 0){
                oddThSum += arr[i];
            }
            else{
                evenThSum += arr[i];
            }
        }

        if(oddThSum >= evenThSum){
            System.out.print(oddThSum-evenThSum);
        }
        else{
            System.out.print(evenThSum-oddThSum);
        }
    }
}