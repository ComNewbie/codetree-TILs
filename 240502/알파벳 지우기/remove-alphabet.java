import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstStr = scan.nextLine();

        String secondStr = scan.nextLine();

        String firstNum = "";

        String secondNum = "";

        for(int i=0;i<firstStr.length();i++){
            char alpha = firstStr.charAt(i);
            if(alpha >= 48 && alpha <= 57){
                firstNum = firstNum.concat(Character.toString(alpha));
            }
        }        
         for(int i=0;i<secondStr.length();i++){
            char alpha = secondStr.charAt(i);
            if(alpha >= 48 && alpha <= 57){
                secondNum = secondNum.concat(Character.toString(alpha));
            }
        }   
        System.out.print(Integer.valueOf(firstNum)+Integer.valueOf(secondNum));        
    }
}