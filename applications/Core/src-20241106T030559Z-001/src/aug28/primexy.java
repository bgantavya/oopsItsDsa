package aug28;
import java.util.Scanner;
public class primexy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = 0;
        for (int i = x; i <= y ; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
                c++;
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
