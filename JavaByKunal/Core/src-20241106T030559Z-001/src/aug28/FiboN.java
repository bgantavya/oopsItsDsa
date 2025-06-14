package aug28;
import java.util.*;
public class FiboN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 0 || n == 1) {
            System.out.println(n);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}