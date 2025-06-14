
import java.util.Scanner;

public class minMax{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.min;
        int min = Integer.max;
        int[] array = new int[n;]
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (max< array[i]){
                max = array[i]
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
    }
}