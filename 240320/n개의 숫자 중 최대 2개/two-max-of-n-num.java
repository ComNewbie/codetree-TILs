import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] arr = new int[N];

        int[] newArr = new int[N-1];

        int max = 0;

        int maxIndex = 0;

        for(int i=0;i<N;i++){
            arr[i] = scan.nextInt();
            if(i == 0){
                max = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.print(max+" ");

        for(int i=0;i<N;i++){
            if(i<maxIndex){
               newArr[i] = arr[i];
            }
            if(i == maxIndex){
                continue;
            }
            if(i>maxIndex){
                newArr[i-1] = arr[i];
            }
            
        }
        
        for(int i=0;i<newArr.length;i++){
            if(i == 0){
                max = newArr[i];
            }
            if(max<newArr[i]){
                max = newArr[i];
            }
        }

        System.out.print(max);

    }
}