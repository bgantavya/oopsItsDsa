
import java.util.Scanner;


public class numberSystem {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[32];
        while(num>0){
            arr[i]= num%2;
            num = num/2;
            i++;

        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
