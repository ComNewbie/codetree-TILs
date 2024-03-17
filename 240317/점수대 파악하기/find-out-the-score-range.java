import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = 0;
    
        int[] arr = new int[11];
    
        int num = 0;

        for(int i=0;true;i++){
            num = scan.nextInt();
            if(num == 0){
                break;
            }
            else{
                arr[(num/10)]++;
                size++;
            }
        }
        
        for(int i=10;i>0;i--){
            System.out.println((i*10)+" - "+arr[i]);
        }
    }
}