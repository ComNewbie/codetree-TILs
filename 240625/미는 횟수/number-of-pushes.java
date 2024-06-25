import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String B = scan.nextLine();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(0)) {
                if (A.substring(i).concat(A.substring(0, i)).equals(B)) {
                    System.out.print(i);
                }
            }
        }
        System.out.print(-1);
    }
}