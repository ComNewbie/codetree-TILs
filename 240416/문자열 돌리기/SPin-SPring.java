import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        
        System.out.println(str);

        for(int i=0;i<str.length();i++){
            str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);
            System.out.println(str);
        }

    }
}