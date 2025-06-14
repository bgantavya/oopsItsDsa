package Sep5;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter array elements");
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        int last = arr[l-1];
        for(int i = l-1; i >= 0; i--) {
            if(i == 0) {
                arr[i] = last;
            } else {
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
