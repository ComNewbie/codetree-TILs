import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.next();
        }

        for(String data : arr){
            System.out.println(data);
        }

    }
}