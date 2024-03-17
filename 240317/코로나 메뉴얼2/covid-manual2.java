import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symptom;

        int[] arr = new int[4];

        int tem = 0;

        for(int i=0;i<3;i++){
            symptom = scan.next().charAt(0);
            tem = scan.nextInt();
            if(symptom == 'Y'){
                if(tem >= 37){
                    arr[0]++;
                }
                else{
                    arr[2]++;
                }
            }
            else{
                if(tem >= 37){
                    arr[1]++;
                }
                else{
                    arr[3]++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if(arr[0]>=2 && i == arr.length-1){
                System.out.print('E');
             }
        }
    }
}