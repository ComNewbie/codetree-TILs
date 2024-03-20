import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arr = new int[N];

        int num = 0;

        int min = 0;

        int count = 0;

        for(int i=0;i<N;i++){
            num = scan.nextInt();
            arr[i] = num;
            if(i == 0){
                min = arr[i];
            }
            if(num<min){
                min = num;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == min){
                count++;
            }
        }   

        System.out.print(min+" "+count);
    }
}