import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        for(int i=0;i<2;i++){
            str += " "+scan.next();
        }

        for(int i=2;i<10;i++){
            System.out.print(str.charAt(i));
        }

    }
}