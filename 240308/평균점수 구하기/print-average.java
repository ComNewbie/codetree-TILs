import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] arr = new double[8];

        double sum = 0.0;

        double avg = 0.0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextDouble();
            sum += arr[i];
        }
        
        avg = sum/8;

        System.out.printf("%.1f" , avg);




        
    }
}