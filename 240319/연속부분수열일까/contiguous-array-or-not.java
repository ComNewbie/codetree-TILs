import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        
        int n2 = scan.nextInt();

        int[] arrA = new int[n1];

        int[] arrB = new int[n2];

        for(int i=0;i<n1;i++){
            arrA[i] = scan.nextInt();
        } 

        for(int i=0;i<n2;i++){
            arrB[i] = scan.nextInt();
        }

        for(int i=0;i<=n1-n2;i++){
            int index = 0;
            boolean compare = false;
            if(arrA[i] == arrB[0]){
                for(int j=i;j<i+n2;j++){
                    if(arrB[index] == arrA[j]){
                        compare = true;
                        index++;
                    }
                    else{
                        break;
                    }
                    if(j == i+n2-1 && compare){
                        System.out.print("Yes");
                        break;
                    }
                }
            }
            if(i == n1-n2 && !compare){
                System.out.print("No");
            }
        }
    }
}