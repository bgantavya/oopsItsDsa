package patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 2*n -1;
        for ( int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col <=row || col>= row-t){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+ " ");
                }

            }
            System.out.println();
        }
    }
}
