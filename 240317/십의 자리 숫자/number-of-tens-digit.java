import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i=0;i<10;i++){
            arr[(scan.nextInt()/10)]++;
        }

        for(int i=1;i<arr.length;i++){
            System.out.println(i+" - "+arr[i]);
        }
    }
}