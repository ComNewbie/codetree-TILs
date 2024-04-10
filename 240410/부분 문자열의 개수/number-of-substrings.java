import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.next();

        String purposeStr = scan.next();

        int count = 0;

        for(int i=0;i<=inputStr.length()-purposeStr.length();i++){
            String comStr = "";

            for(int j=0;j<purposeStr.length();j++){
                comStr += inputStr.charAt(i+j);
            }

            if(comStr.equals(purposeStr)){
                count++;
            }

        }

        System.out.print(count);
        

    }
}