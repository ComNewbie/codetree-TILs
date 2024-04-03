import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = new String[10];
        
        int count = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.next();
           
        }

        char alpha = scan.next().charAt(0);

        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length();j++){
                if((j == arr[i].length()-1) && arr[i].charAt(j) == alpha){
                    System.out.println(arr[i]);
                    count++;
                }
            }
        } 

        if(count == 0){
            System.out.print("None");
        }

        
    }
}