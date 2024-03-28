import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int count = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<count;j++){
                if(j == 0 || j == count - 1){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
            count++;
        }

        for(int[] e : arr){
            for(int f : e){
                if(f != 0){
                    System.out.print(f+" ");
                }
            }
            System.out.println();
        }

    }
}