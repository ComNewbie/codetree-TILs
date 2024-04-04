import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String[] arr = new String[n];

        int count = 0;

        double strSum = 0.0;

        for(int i=0;i<n;i++){
            arr[i] = scan.next();
        }

        char alpha = scan.next().charAt(0);


        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0) == alpha){
                count++;
                strSum += arr[i].length();
            }
            
        }

        System.out.printf("%d %.2f",count,(strSum/count));

    }
}