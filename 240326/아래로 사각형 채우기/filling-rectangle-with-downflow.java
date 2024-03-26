import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i] = num;
                num++;
            }
        }

    for(int[] e:arr) {
        for(int f:e){
            System.out.print(f+" ");
        }
        System.out.println();
    }        

    }
}