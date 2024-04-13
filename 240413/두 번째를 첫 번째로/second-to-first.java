import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char[] arr = str.toCharArray();

        char standard = arr[1];

        for(int i=1;i<arr.length;i++){
            if(standard == arr[i]){
                arr[i] = arr[0];
            }
        }

        for(char data : arr){
            System.out.print(data);
        }


    }
}