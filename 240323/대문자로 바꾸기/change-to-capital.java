import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char alpha = ' ';

        for(int i=0;i<5;i++){
            alpha = ' ';
            for(int j=0;j<3;j++){
                alpha = scan.next().charAt(0);
                String uppercaseAlpha = Character.toString(alpha).toUpperCase();
                System.out.print(uppercaseAlpha+" ");
            }
            System.out.println();
        }    
    }
}