package Oct15;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                if(i < 1 || i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0; i < n; i++) {
//            int number = 1; // Represents iC0
//            for(int j = 0; j <= i; j++) {
//                System.out.print(number + " ");
//                number = number * (i - j) / (j + 1); // Update for next element in row
//            }
//            System.out.println();
//        }
//    }
}
