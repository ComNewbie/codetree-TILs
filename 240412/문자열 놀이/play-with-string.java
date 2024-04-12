import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        char[] arr = s.toCharArray();

        int q = scan.nextInt();

        for(int i=0;i<q;i++){
            int type = scan.nextInt();

            if(type == 1){
                int a = scan.nextInt();

                int b = scan.nextInt();

                char temp = arr[a-1];

                arr[a-1] = arr[b-1];

                arr[b-1] = temp;

                for(char data : arr){
                    System.out.print(data);
                }
                System.out.println();


            }
            if(type ==2){
                char a = scan.next().charAt(0);
                
                char b = scan.next().charAt(0);

                for(int j=0;j<arr.length;j++){
                    if(arr[j] == a){
                        arr[j] = b;
                    }
                }
                for(char data : arr){
                    System.out.print(data);
                }
                System.out.println();
            }
        }

    }
}