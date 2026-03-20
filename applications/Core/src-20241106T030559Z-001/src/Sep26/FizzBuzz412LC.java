package Sep26;
// Leetcode 412
import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz412LC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if(i % 3 == 0) {
                arr.add("Fizz");
            } else if(i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(String.valueOf(i));
            }
        }
        System.out.println(arr);

//        without using the modulo operator
//        int c3 = 1;
//        int c5 = 1;
//        for(int i = 1; i <= n; i++) {
//            if(c3 == 3 && c5 == 5) {
//                arr.add("FizzBuzz");
//                c3 = 0;
//                c5 = 0;
//            } else if(c3 == 3) {
//                arr.add("Fizz");
//                c3 = 0;
//            } else if(c5 == 5) {
//                arr.add("Buzz");
//                c5 = 0;
//            } else {
//                arr.add(String.valueOf(i));
//            }
//            c3++;
//            c5++;
//        }
//        System.out.println(arr);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+","+b);
    }
}
