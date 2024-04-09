import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int eeCount = 0;

        int ebCount = 0;

        for(int i=0;i<str.length()-1;i++){
            String result = str.charAt(i)+""+str.charAt(i+1);
            if(result.equals("ee")){
                eeCount++;
            }
            if(result.equals("eb")){
                ebCount++;
            }
        }
        System.out.print(eeCount+" "+ebCount);

    }
}