package aug28;
import java.util.*;
public class firstNprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
            for (int i = 2;     ; i++) {
                if(c < n) {
                    if (isPrime(i)) {
                        System.out.print(i + ",");
                        c++;
                    }
                } else {
                    break;
                }
            }
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }
}
