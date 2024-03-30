import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String strA = scan.next();

        String strB = scan.next();

        if(strA.length() > strB.length()){
            System.out.print(strA+" "+strA.length());
        }
        if(strA.length() < strB.length()){
            System.out.print(strB+" "+strB.length());
        }
        if(strA.length() == strB.length()){
            System.out.print("same");
        }



    }
}