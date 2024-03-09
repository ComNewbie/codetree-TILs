import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int student = scan.nextInt();

        int[] scoreArray = new int[4];

        int passCount = 0;

        for(int j=0;j<student;j++){
            int sum = 0;
            for(int i=0;i<scoreArray.length;i++){
                scoreArray[i] = scan.nextInt();
                sum += scoreArray[i];
                if(i == scoreArray.length-1){
                    if((double) sum/4 >= 60){
                        System.out.println("pass");
                        passCount++;
                    }
                    else{
                        System.out.println("fail");
                    }
                }
            }
        }
        System.out.print(passCount);
    }
}