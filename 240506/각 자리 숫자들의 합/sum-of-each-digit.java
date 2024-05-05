import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.next();
        
        int sum = 0;

        for(int i=0;i<number.length();i++){
            char alpha = number.charAt(i);

            sum += Character.getNumericValue(alpha);
        }

        System.out.print(sum);

    }
}