import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String result = str;

        for(int i=str.length()-1;i>=1;i--){
            int num = scan.nextInt();

            if(num > i){
                result = result.substring(0,result.length()-1);
            }
            else{
                result = result.substring(0,num)+result.substring(num+1);
            }
            System.out.println(result);
        }

    }
}