import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr= scan.next();

        String purposeStr = scan.next();

        for(int i=0;i<=inputStr.length()-purposeStr.length();i++){
            String comStr = "";

            for(int j=0;j<purposeStr.length();j++){
                comStr += inputStr.charAt(i+j);
            }

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