import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        int evenCount = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }        

        int[] evenArr = new int[evenCount];

        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenArr[index] = arr[i];
                index++;
            }
        }

        for(int data : evenArr){
            System.out.print(data+" ");
        }

    }
}