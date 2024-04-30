import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        for(int i=0;i<str.length();i++){
            char alpha = str.charAt(i);
            if(alpha >= 65 && alpha <= 90){
                System.out.print(Character.toString(alpha).toLowerCase());
            }
            if(alpha >= 97 && alpha <= 122){
                System.out.print(Character.toString(alpha).toUpperCase());
            }
        }

    }
}