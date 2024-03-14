import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 1+n;

        int[] arr = new int[2];

        arr[0] = 1;
        arr[1] = n;

        for(int data : arr){
            System.out.print(data+" ");
        }
    
        for(int i=0;true;i++){
            if(sum <= 100){
                System.out.print(sum+" ");
                arr[0] = arr[1];
                arr[1] = sum;
                sum = arr[0] + arr[1];
            }
            else{
                System.out.print(sum);
                break;
            }

        }
    }
}