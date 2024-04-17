import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.next().charAt(0);
        
        char second = scan.next().charAt(0);

        if(first > second){
            System.out.print((int) first + (int) second + " " + ((int) first - (int) second));
        }
        else{
            System.out.print((int) first + (int) second + " " + ((int) second - (int) first));
        }

    }
}