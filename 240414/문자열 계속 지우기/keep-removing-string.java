import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.next();

        String B = scan.next();

        String result = A;

        boolean modified = true;
        
        while (modified) {
            modified = false; // modified 변수를 초기화

            for (int i = 1; i < result.length(); i++) {
                if (result.substring(i - 1, i + 1).equals(B)) {
                    result = result.substring(0, i - 1) + result.substring(i + 1);
                    modified = true; // result가 변경되었음을 표시
                    break; // for 루프를 중단하고 while 루프의 조건을 다시 검사
                }
            }
        }
        System.out.print(result);

    }
}