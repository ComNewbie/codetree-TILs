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

            for (int i = 0; i <= result.length()- B.length(); i++) {
                if (result.substring(i , i + B.length()).equals(B)) {
                    result = result.substring(0, i) + result.substring(i + B.length());
                    modified = true; // result가 변경되었음을 표시
                    break; // for 루프를 중단하고 while 루프의 조건을 다시 검사
                }
            }
        }
        System.out.print(result);

    }
}