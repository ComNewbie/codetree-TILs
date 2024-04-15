import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();



        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                System.out.print(str.substring(0,i)+str.substring(i+1));
                break;
            }
        }

    }
}