import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = new char[10];

        for(int i=0;i<10;i++){
            arr[i] = scan.next().charAt(0);
        }

        for(int i=9;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}