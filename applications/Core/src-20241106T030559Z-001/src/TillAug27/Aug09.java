package TillAug27;

import java.util.*;
public class Aug09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(max(3,5,3));
//        int n = sc.nextInt();
//        System.out.println(oddEven(n));
//        System.out.println(reverse(5893));
//        System.out.printf(replace(5889534));
    }
    static int reverse(int n) {
        int r;
        int rev = 0;
        while(n != 0) {
            r =  n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }
        return rev;
    }
    static int replace(int n) {
        int r;
        int rev = 0;
        while(n != 0) {
            r =  n % 10;
            if(r == 5) {
                rev = rev * 10 + r;
            } else {
                rev = rev * 10 + r;
            }
            n = n/10;
        }
        return rev;
    }
    static int oddEven(int n) {
        if(n % 2 == 0) {
            return 1;
        }
        return 0;
    }
    static int max(int a,int b, int c) {
        if(a>b && a>c) {
            return a;
        } else if(b>a && b>c) {
            return b;
        }
        return c;
    }
}