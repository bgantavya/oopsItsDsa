package TillAug27;

// TillAug27.GCD using Euclidean algorithm
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(36,60));
    }
    public static int gcd(int x, int y) {
        int rem = x;
        int divisor = x;
        int dividend = y;
        while(dividend % divisor > 0) {
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
        // lcm = (x*y)/gcd
    }
}