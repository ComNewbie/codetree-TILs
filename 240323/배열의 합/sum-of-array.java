import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i=0;i<4;i++){
            sum = 0;
            for(int j=0;j<4;j++){
                sum += scan.nextInt();
            }
            System.out.println(sum);
        }
    
    }
}