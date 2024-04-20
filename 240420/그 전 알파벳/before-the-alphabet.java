import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char alpha = scan.next().charAt(0);

        if(alpha == 'a'){
            System.out.print('z');
        }
        else{
            System.out.print((char) (alpha-1));
        }
    
    }
}