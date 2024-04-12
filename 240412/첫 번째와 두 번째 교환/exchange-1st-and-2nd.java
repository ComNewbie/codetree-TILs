import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char[] arr = str.toCharArray();

        char firstChar = arr[0];

        char secondChar = arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i] == firstChar){
                arr[i] = secondChar;
                continue;
            }
            if(arr[i] == secondChar){
                arr[i] = firstChar;
            }
        }

        for(char data : arr){
            System.out.print(data);
        }

    }
}