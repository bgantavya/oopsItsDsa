package aug28;
import java.util.Scanner;
public class isFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n == 0 || n == 1) {
            System.out.println("fibonacci");
        } else {
            for (int i = 2; ; i++) {
                c = a + b;
                a = b;
                b = c;
                if(c < n) {
                    continue;
                }
                else if(c == n) {
                    System.out.println("fibonacci");
                    break;
                }
                else if(c > n) {
                    System.out.println("not fibonacci");
                    break;
                }
            }
        }
    }
}