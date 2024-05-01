import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();

        String B = scan.next();

        System.out.print(Integer.valueOf(A.concat(B)) + Integer.valueOf(B.concat(A)));

    }
}