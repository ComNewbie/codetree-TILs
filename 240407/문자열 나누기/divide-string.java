import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String str = "";

        for(int i=0;i<n;i++){
            str = str.concat(scan.next());
        }

        for(int i=0;i<str.length();i++){
            if(i % 5 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(str.charAt(i));

        }

    }
}