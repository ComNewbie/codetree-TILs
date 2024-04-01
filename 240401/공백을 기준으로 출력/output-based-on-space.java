import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        str = str.concat(scan.nextLine());

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
}