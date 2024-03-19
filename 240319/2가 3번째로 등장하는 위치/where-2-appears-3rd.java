import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        int count = 0;

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            if(arr[i] == 2){
                count++;
            }
            if(count == 3){
                System.out.print(i+1);
                break;
            }
        }
    }
}