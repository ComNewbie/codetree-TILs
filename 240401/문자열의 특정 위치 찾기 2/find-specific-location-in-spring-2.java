import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] strArr = {"apple", "banana", "grape", "blueberry","orange"};

        char alpha = scan.next().charAt(0);

        int count = 0;

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].charAt(3) == alpha || strArr[i].charAt(2) == alpha){
                System.out.println(strArr[i]);
                count++;
            }
        }

        System.out.print(count);

    }
}