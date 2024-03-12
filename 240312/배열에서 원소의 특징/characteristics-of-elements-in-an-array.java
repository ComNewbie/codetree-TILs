import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] != 0 && arr[i] % 3 == 0){
                System.out.print(arr[i-1]);
                break;
            }
        }

    }
}