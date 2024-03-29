import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;

        for(int i=0;i<m;i++){
            arr[scan.nextInt()-1][scan.nextInt()-1] = num;
            num++;
        }   

        for(int[] e : arr){
            for(int f : e){
                System.out.print(f+" ");
            }
            System.out.println();
        }

    }
}