import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arr = {'L','E','B','R','O','S'};

        char message = scan.next().charAt(0);

        for(int i=0;i<arr.length;i++){
            if(message == arr[i]){
                System.out.print(i);
                break;
            }
            if(i == arr.length-1){
                System.out.print("none");
            }
        }
        
    }
}