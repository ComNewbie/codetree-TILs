import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;

        String[] answer = new String[100];

        int count = 0;

        for(int i=1;i<201;i++){
            String str = scan.next();
            if(str.equals("0")){
                total = i-1;
                break;
            }

            if(i % 2 == 1){
                answer[count] = str;
                count++;
            }
        }

        System.out.println(total);
        for(String data : answer){
            if(data != null){
                System.out.println(data);
            }   
        }
        scan.close();
    }
}