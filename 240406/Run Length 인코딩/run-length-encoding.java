import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String str = scan.next();

         int count = 0;

         String answer = "";

         char currentChar = str.charAt(0);

         for(int i=1;i<str.length();i++){
            if(str.charAt(i) == currentChar){
                count++;
            }

            else{
                count++;
                answer += currentChar + String.valueOf(count);                
                count = 0;
                currentChar = str.charAt(i);
            }
        }

        answer += currentChar + String.valueOf(count+1);
        System.out.println(answer.length());
        System.out.println(answer);



         



    }
}