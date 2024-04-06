import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String answer = "";

        for(int i=0;i<str.length();i++){
            if(i % 2 == 1){
                answer += str.charAt(i);
            }
        }        
        for(int i=answer.length()-1;i>=0;i--){
            System.out.print(answer.charAt(i));   
        }

    }
}