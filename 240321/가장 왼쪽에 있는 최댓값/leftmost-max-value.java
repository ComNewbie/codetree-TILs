import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arr = new int[N];

        int max = 0;
        int maxIndex = N-1;

        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }        

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.print(maxIndex+1+" ");

        while(maxIndex != 0){
            max = 0;
            for(int i=0;i<maxIndex;i++){
                if(arr[i] > max){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            System.out.print(maxIndex+1+" ");
        }    
    }
}