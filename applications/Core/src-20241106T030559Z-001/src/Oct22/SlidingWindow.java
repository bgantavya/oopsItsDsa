package Oct22;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int k = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxsum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        for(int i = k; i < arr.length; i++) {
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            maxsum = Math.max(maxsum,sum);
        }

    }
}
