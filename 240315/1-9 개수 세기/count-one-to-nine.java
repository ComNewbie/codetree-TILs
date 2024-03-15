import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] count = new int[9];

        int n = scan.nextInt();

        for(int i=0;i<n;i++){
            count[scan.nextInt()-1]++;
        }

        for(int data : count){
            System.out.println(data);
        }

    }

}