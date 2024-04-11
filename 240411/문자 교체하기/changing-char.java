import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();

        String str2 = scan.next();

        System.out.print(str1.substring(0,2)+str2.substring(2));

    }
}