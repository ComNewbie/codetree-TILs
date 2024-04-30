import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int sum = 0;

        for(int i=0;i<str.length();i++){
            char alpha = str.charAt(i);

            if(alpha >= 48 && alpha <= 58){
                sum += Integer.parseInt(String.valueOf(alpha));
            }
        }

        System.out.print(sum);

    }
}