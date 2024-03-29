import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int m = scan.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<m;i++){
            int x = scan.nextInt()-1;
            
            int y = scan.nextInt()-1;

            arr[x][y] = (x+1)*(y+1);
        }

        for(int[] e : arr){
            for(int f : e){
                System.out.print(f+" ");
            }
            System.out.println();
        }

    
    }
}