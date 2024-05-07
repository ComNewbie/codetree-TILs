import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum  = 0;

        for(int i=0;i<n;i++){
            sum += scan.nextInt();
        }

        char[] sumArr = Integer.toString(sum).toCharArray();

        if(sumArr.length > 1){
            for(int i=1;i<sumArr.length;i++){
                System.out.print(sumArr[i]);
            }
        }
        System.out.print(sumArr[0]);
        

        

    }
}