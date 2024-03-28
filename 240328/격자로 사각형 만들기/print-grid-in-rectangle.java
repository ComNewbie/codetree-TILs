import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            arr[i][0] = 1;
            arr[0][i] = 1;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int[] e : arr){
            for(int f : e){
                System.out.print(f+" ");
            }
            System.out.println();
        }
    }
}