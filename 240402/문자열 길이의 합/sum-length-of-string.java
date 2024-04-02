import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int strTotalLength = 0;

        int count = 0;

        String str = null;

        for(int i=0;i<n;i++){
            str = scan.next();
            if(str.charAt(0) == 'a'){
                count++;
            }
            strTotalLength += str.length();
        }

        System.out.print(strTotalLength + " " + count);

    }
}