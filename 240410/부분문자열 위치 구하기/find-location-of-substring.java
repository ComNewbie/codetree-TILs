import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr= scan.next();

        String purposeStr = scan.next();

        for(int i=0;i<=inputStr.length()-purposeStr.length();i++){
            String comStr = inputStr.charAt(i)+""+inputStr.charAt(i+1);

            if(comStr.equals(purposeStr)){
                System.out.print(i);
                break;
            }
            if(i == inputStr.length()-purposeStr.length()){
                System.out.print(-1);
            }
        }

    }
}