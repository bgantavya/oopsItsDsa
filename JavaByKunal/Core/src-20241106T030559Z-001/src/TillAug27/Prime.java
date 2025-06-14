package TillAug27;// 1) check n is prime or not
// 2)print all prime number between x and y
// 3) print first m prime numbers
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        int n = sc.nextInt();
//        isPrime(n);
//        //2
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        //3
//        int m = sc.nextInt();
//
//        for(int i = x; i < y; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//
//        for(int i = 1; i <= m; i++) {
//            if(isPrime(i)) {
//                System.out.println(i);
//            }
//        }
//    }
        System.out.println(isPrime(49));
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }
}
