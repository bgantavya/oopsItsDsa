package Oct15;

import java.util.Scanner;

public class tSum {
    int []ans = new int[2];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int t = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == t) {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}