package patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(flag+ " ");
                if(flag==1){
                    flag =0;
                }
                else{
                    flag=1;
                }
            }
            System.out.println();
            
        }
    }
}
