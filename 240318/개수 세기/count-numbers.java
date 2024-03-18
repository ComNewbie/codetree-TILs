import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();

        int count = 0;

        for(int i=0;i<n;i++){
            if(m == scan.nextInt()){
                count++;
            }
        }
        System.out.print(count);
    
    }
}