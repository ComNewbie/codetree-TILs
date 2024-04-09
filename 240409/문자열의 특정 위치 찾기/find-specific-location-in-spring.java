import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char alpha = scan.next().charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == alpha){
                System.out.print(i);
                break;
            }
            if(i == str.length()-1){
                System.out.print("No");
            }
        }



    }
}