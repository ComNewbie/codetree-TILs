import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        

        for(int i=0;i<11;i++){
            String str = scan.nextLine();
            StringBuffer sb = new StringBuffer(str);
            if(str.equals("END")){
                break;
            }
            System.out.println(sb.reverse().toString());

        }

    }
}