import java.util.Scanner;
public class revArray {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int[] array = {10,20,-20,30};
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }}