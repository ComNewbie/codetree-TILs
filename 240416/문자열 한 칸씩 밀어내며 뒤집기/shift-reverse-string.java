import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        int q = scan.nextInt();

        for(int i=0;i<q;i++){
            int request = scan.nextInt();
            if(request == 1){
                str = str.substring(1)+str.charAt(0);
                System.out.println(str);
            }
            if(request == 2){
                str = str.charAt(str.length()-1)+str.substring(0,str.length()-1);
                System.out.println(str);
            }
            if(request == 3){
                StringBuffer sb = new StringBuffer(str);
                str = sb.reverse().toString();
                System.out.println(str);
            }
        }



    }
}