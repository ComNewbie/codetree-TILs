import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();

        String B = scan.next();

        if(A.concat(B).equals(B.concat(A))){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }

    }
}