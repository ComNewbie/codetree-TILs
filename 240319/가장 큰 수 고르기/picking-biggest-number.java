import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;

        for(int i=0;i<10;i++){
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.print(max);

    }
}