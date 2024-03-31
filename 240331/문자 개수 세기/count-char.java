import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        char alpha = scan.next().charAt(0);

        int count = 0;

        for(int i=0;i<str.length();i++){
            if(alpha == str.charAt(i)){
                count++;
            }
        }

        System.out.print(count);

    }
}