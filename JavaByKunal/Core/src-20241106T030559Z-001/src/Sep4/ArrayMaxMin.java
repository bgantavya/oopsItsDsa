package Sep4;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter array elements");
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < l; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min+" is minimum");
        System.out.println(max+" is maximum");
    }
}
