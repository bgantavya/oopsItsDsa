
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        // Q1. check n is prime or not 
        // take n for user
        // Q2. Print all the prime numbers bw x and y
        // Q3. print first n prime numbers
        // if n = 5; o/p = = 2,3,5,7,11


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pro = 1;
        for (int i = 2; i <= num; i++) {
            pro = pro*i;
        }
        System.out.println(pro);

    }
}
