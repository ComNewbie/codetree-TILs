import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        String sum = Integer.toString(num1+num2);

        int count = 0;

        for(int i=0;i<sum.length();i++){
            char alpha = sum.charAt(i);

            if(alpha == '1'){
                count++;
            }
        }
        System.out.print(count);

    }
}