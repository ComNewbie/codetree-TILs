import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char alpha = scan.next().charAt(0);
        
        System.out.print((int) 'z');

        if(alpha == 'z'){
            System.out.print('a');
        }
        else{
            System.out.print((char) ((int) alpha+1));        
        }


    }
}