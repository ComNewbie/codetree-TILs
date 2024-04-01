import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strArr = new String[4];

        for(int i=0;i<strArr.length;i++){
            strArr[i] = scan.nextLine();
        }

        for(int i=strArr.length-1;i>=0;i--){
            System.out.println(strArr[i]);
        }

    }
}