import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dice = new int[6];

        for(int i=0;i<10;i++){
            dice[scan.nextInt()-1]++;
        }

        for(int i=0;i<dice.length;i++){
            System.out.println((i+1)+" - "+dice[i]);
        }
    }
}