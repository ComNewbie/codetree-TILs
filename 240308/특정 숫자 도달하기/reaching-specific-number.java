import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        
        int stop = 0;

        int sum = 0;
        
        double avg = 0.0;

        for(int i=0;i<10;i++){
            arr[i] = scan.nextInt();
            if(arr[i] >= 250){
                break;
            }
            stop++;
        }
        
        for(int i=0;i<stop;i++){
            sum+=arr[i];
        }

        avg = (double) sum/stop;

        System.out.printf("%d %.1f", sum, avg);

    }
}