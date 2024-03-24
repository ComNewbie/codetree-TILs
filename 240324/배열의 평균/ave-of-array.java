import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] number = new int[2][4];

        double sum = 0;

        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                number[i][j] = scan.nextInt();
            }
        } 

        for(int i=0;i<2;i++){
            sum = 0;
            for(int j=0;j<4;j++){
                sum += number[i][j]; 
            }
            System.out.print((double) sum/4+" ");
        } 

        System.out.println();

        for(int i=0;i<4;i++){
            sum = 0;
            for(int j=0;j<2;j++){
                sum += number[j][i]; 
            }
            System.out.print((double) sum/2+" ");
        } 
        
        System.out.println();
        
        sum = 0;
        
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                sum += number[i][j]; 
            }
        } 
        System.out.printf("%.1f",(double) sum/8);

    }
}