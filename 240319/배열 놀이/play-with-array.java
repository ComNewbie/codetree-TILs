import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int q = scan.nextInt();

        int[] arr = new int[n];

        int vaginal = 0;

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<q;i++){
            vaginal = scan.nextInt();
            if(vaginal == 1){
                int a = scan.nextInt();
                System.out.println(arr[a-1]);
            }
            if(vaginal == 2){
                int a = scan.nextInt();
                for(int j=0;j<n;j++){
                    if(arr[j] == a){
                        System.out.println(j+1);
                        break;
                    }
                    if(j == n-1){
                        System.out.println(0);
                    }
                }
            }
            if(vaginal == 3){
                int a = scan.nextInt();
                int b = scan.nextInt();
                for(int j=a-1;j<b;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}