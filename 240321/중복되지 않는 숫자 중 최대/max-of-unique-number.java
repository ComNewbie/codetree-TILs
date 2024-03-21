import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int max = 0;

        int num = 0;

        for(int i=0;i<N;i++){
            num = scan.nextInt();
            if(num > max){
                max = num;
            }
            else if (num == max){
                max = 0;
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