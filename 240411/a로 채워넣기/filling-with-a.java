import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.print(str.substring(0,1)+"a"+str.substring(2,str.length()-2)+"a"+str.substring(str.length()-1));

    }
}