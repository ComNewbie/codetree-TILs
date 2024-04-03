import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] arr = new String[10];

        for(int i=arr.length-1;i>=0;i--){
            arr[i] = scan.next();
        }

        for(String str : arr){
            System.out.println(str);
        }


    }
}