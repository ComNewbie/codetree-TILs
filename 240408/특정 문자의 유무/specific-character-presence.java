import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String comFirst = "No";

        String comSecond = "No";

        for(int i=0;i<str.length()-1;i++){
            String result = str.charAt(i)+""+str.charAt(i+1);
            if(result.equals("ee")){
                comFirst = "Yes";
            }
            if(result.equals("ab")){
               comSecond = "Yes";
            }
        }
        System.out.print(comFirst+" "+comSecond);

    }
}