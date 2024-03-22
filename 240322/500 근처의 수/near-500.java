import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        int max = 0;
        
        int min = 1000;

        for(int i=0;i<10;i++){
            num = scan.nextInt();
            if(num < 500){
                if(num > max){
                    max = num;
                }
            }
            if(num > 500){
                if(num < min){
                    min = num;
                }
            }
        }

        System.out.print(max+" "+min);

    }
}