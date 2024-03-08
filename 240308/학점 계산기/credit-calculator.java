import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        double[] arr = new double[n];
        
        double sum = 0.0;

        double avg = 0.0;

        String grade = "";

        for(int i=0;i<n;i++){
            arr[i] = scan.nextDouble();
            sum += arr[i];
        }

        avg = sum/n;
        
        if(avg > 4.0) {
            grade = "Perfect";
        }
        else if(avg > 3.0){
            grade = "Good";
        }
        else {
            grade = "Poor";
        }


        System.out.printf("%.1f",avg);
        System.out.println();
        System.out.print(grade);

        
        
    }
}