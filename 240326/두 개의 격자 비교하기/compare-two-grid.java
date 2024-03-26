import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        int num = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scan.nextInt();
            }
        }

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num = scan.nextInt();
                if(num == arr[i][j]){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }

    }
}