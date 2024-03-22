import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] price = new int[n];

        int[] revenue = new int[(n*(n+1))/2];

        int index = 0;

        int maxRevenue = 0;

        for(int i=0;i<price.length;i++){
            price[i] = scan.nextInt();
        }

        for(int i=0;i<price.length;i++){
            for(int j=i+1;j<price.length;j++){
                revenue[index] = price[j] - price[i];
                index++;
            }
        }

        for(int i=0;i<revenue.length;i++){
            if(revenue[i] > maxRevenue ){
                maxRevenue = revenue[i];
            }
        }
        if(maxRevenue <= 0){
            System.out.print(0);
        }
        else{
            System.out.print(maxRevenue);
        }
    }
}