import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int student = scan.nextInt();

        int[] scoreArray = new int[4];

        int th = 0;

        int passCount = 0;

        String[] pnf = new String[student];

        for(int j=0;j<student;j++){
            int sum = 0;
            for(int i=0;i<scoreArray.length;i++){
                scoreArray[i] = scan.nextInt();
                sum += scoreArray[i];
                if(i == scoreArray.length-1){
                    if((double) sum/4 >= 60){
                        pnf[th] = "pass";
                        passCount++;
                    }
                    else{
                        pnf[th] = "fail";
                    }
                    th++;
                }
            }
        }
       
        for(int i=0;i<pnf.length;i++){
            System.out.println(pnf[i]);
            if(i == pnf.length-1){
                System.out.print(passCount);
            }
        }

       
    }
}