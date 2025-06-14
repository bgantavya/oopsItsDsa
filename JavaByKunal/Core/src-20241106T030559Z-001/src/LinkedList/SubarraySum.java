package LinkedList;
import java.util.*;
// take an array and an input t from a user print the minimum length of sub-array whose sum = t
public class SubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int min_length = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = 0;
            for(int j = i ; j < n; j++) {
                sum = sum + arr[j];
                if (sum == t) {
                    if ((j-i+1) < min_length) {
                        min_length = (j-i+1);
                    }
                }
            }
        }
        if(min_length == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min_length);
        }
    }
}
