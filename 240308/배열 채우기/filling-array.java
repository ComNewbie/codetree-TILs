import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        
        int stop = 0;

        for (int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i]==0){
                break;
            }
            stop++;
        }

        for(int i=stop-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}