import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = null;

        for(int i=0;i<10;i++){
            str = scan.next();
            if(i % 2 == 0){
                System.out.println(str);
            }
        }

    }
}