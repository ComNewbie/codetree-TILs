import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstStr = scan.next();

        int firstNum = 0;

        String secondStr = scan.next();

        int secondNum = 0;

        for(int i=0;i<firstStr.length();i++){
            char number = firstStr.charAt(i);
            if(number >= 48 && number <= 57){
                continue;
            }
            firstNum = Integer.valueOf(firstStr.substring(0,i));
            break;
        }

        for(int i=0;i<secondStr.length();i++){
            char number = secondStr.charAt(i);
            if(number >= 48 && number <= 57){
                continue;
            }
            secondNum = Integer.valueOf(secondStr.substring(0,i));
            break;
        }

        System.out.print(firstNum + secondNum);

    }
}