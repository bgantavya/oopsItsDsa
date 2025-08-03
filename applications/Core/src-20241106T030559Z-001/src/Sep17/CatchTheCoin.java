package Sep17;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// https://codeforces.com/problemset/problem/1989/A
public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int [n][2];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Boolean> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(arr[i][1] < -1) {
                l.add(true);
            } else {
                l.add(false);
            }
        }
        System.out.println(l);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2]; // To store coin coordinates (x, y)
//
//        // Reading the coordinates of the coins
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = sc.nextInt(); // x-coordinate
//            arr[i][1] = sc.nextInt(); // y-coordinate
//        }
//
//        // List to store whether Monocarp can collect the coin
//        ArrayList<String> results = new ArrayList<>();
//
//        // Evaluating each coin
//        for (int i = 0; i < n; i++) {
//            int x = arr[i][0];
//            int y = arr[i][1];
//
//            // If the absolute value of x is less than or equal to the absolute value of y,
//            // Monocarp can reach the coin before it falls too far.
//            if (Math.abs(x) <= Math.abs(y)) {
//                results.add("YES");
//            } else {
//                results.add("NO");
//            }
//        }
//
//        // Output the result for each coin
//        for (String result : results) {
//            System.out.println(result);
//        }
//    }
}
