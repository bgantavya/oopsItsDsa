package TillAug27;

import java.util.*;
public class Aug14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            System.out.println(isArm(n));
        } else {
            System.out.println(false);
        }
    }
    public static boolean isArm(int n){
        int num = n;
        int r = 0;
        double sum = 0;
        int c = 0;
        while (n > 0) {
            n = n / 10;
            ++c;
        }
        n = num;
        while (n > 0) {
            r = n % 10;
            sum = sum + Math.pow(r, c);
            n = n / 10;
        }

        if ((int) sum == num) {
            return true;
        }
        return false;
    }
}