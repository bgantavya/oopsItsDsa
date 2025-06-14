package Sep5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter array elements");
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = l-1;
        while(start < end) {
            int c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
