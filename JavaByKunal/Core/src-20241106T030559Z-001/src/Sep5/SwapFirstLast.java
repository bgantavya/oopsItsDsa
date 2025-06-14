package Sep5;

import java.util.Arrays;
import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter array elements");
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int c = arr[0];
        arr[0] = arr[l-1];
        arr[l-1] = c;
        System.out.println(Arrays.toString(arr));
    }
}
