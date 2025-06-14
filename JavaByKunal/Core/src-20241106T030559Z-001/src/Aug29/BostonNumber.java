package Aug29;
import java.util.*;
import java.util.ArrayList;
public class BostonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 1) {
            int digitSum = Sum(n);
            int factorSum = Factors(n);
            if (digitSum == factorSum) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
    public static int Factors(int n) {
        ArrayList<Integer> factor = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    factor.add(i);
                } else {
                    factor.add(i);
                    factor.add(n/i);
                }
            }
        }

        int s = 0;
        for(int i: factor) {
            s = s + Sum(i);
        }
        return s;
    }
    public static int Sum(int n) {
        int sum = 0;
        int r = 0;
        while(n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        return sum;
    }
}