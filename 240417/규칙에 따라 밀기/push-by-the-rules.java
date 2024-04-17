import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();

        String Command = scan.next();

        char[] arr = Command.toCharArray();

        int L = 0;
        int R = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'L'){
                L++;
            }
            if(arr[i] == 'R'){
                R++;
            }
        }
        if(L > R){
            System.out.print(A.substring((L-R))+A.substring(0,(L-R)));
        }
        else{
            System.out.print(A.substring(A.length()-(R-L))+A.substring(0,A.length()-(R-L)));
        }


    }
}