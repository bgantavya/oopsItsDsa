package Sep6;
import java.util.*;
public class findIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j =0; j< n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter target");
        int k = sc.nextInt();
        int c = 0;
        for(int i = 0; i< m; i++) {
            for(int j =0; j< n; j++) {
                if(arr[i][j] == k) {
                    System.out.println(i+","+j);
                    c++;
                }
            }
        }
        if(c == 0) {
            System.out.println(-1);
        }
    }
}
