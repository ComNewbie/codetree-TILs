import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int n = scan.nextInt();

        if(n>str.length()){
                System.out.print(str.reverse());
        }
        else{
            for(int i=str.length()-1;i>=str.length()-n;i--){
                System.out.print(str.charAt(i));
            }
        }

    }
}