import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int num = 1;

        for(int i=n-1;i>=0;i--){
            if(i % 2 == 1){
                for(int j=n-1;j>=0;j--){
                    arr[j][i] = num;
                    num++;
                }
            }
            else{
                for(int j=0;j<n;j++){
                    arr[j][i] = num;
                    num++;
                }   
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