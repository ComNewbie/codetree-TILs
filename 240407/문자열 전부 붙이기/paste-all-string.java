import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String str = "";

        for(int i=0;i<n;i++){
            str = str.concat(scan.next());
        }

        System.out.print(str);

    }
}