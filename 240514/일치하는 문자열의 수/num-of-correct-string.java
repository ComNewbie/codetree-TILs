import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String A = scan.next();

        int count = 0;

        for(int i=0;i<n;i++){
            String str = scan.nextLine();
            if(str.equals(A)){
                count++;
            }
        }
        System.out.print(count);

    }
}