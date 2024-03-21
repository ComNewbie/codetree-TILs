import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] num = new int[1000];

        int max = 0;

        for(int i=0;i<N;i++){
            num[scan.nextInt()-1]++;
        }

        for(int i=0;i<num.length;i++){
            if(num[i] == 1 && num[i] > max){
                max = i+1;
            }
        }

        if(max == 0){
            System.out.print(-1);
        }
        else{
            System.out.print(max);
        }
        
    
    }
}