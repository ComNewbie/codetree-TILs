import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        for(int i=0;true;i++){
            num = scan.nextInt();
            if(num != 0){
                if((num % 2) != 0){
                    System.out.print((num+3)+" ");
                }
                else{
                    System.out.print((num/2)+" ");
                }
            }
            else{
                break;
            }
        }
    }
}