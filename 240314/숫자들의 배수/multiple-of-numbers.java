import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int countMo5 = 0;
        
        for(int i=1;true;i++){
            System.out.print(num * i+" ");
            if((num * i) % 5 == 0){
                countMo5++;
            }
            if(countMo5 == 2){
                break;
            }
        }
    }
}