import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        
        int min = 0;

        int num = 0;
        
        for(int i=0;true;i++){
            num = scan.nextInt();
            if(num == 999 || num == -999){
                break;
            }
            if(i == 0){
                min = num;
                max = num;
            }
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        } 
        System.out.print(max+" "+min);
    
    }
}