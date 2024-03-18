import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = scan.nextInt();

        int[] remain = new int[b];

        int sum = 0;

        for(int i=0;true;i++){
            remain[a%b]++;
            if(a/b == 0){
                break;
            }
            a = a/b;
        }

        for(int i=0;i<remain.length;i++){
            sum += remain[i]*remain[i];
        }        
        System.out.print(sum);
    }
}