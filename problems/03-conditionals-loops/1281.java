import java.util.Scanner;
// LeetCode Problem 1281: Subtract the Product and Sum of Digits of an Integer
// Given an integer n, return the difference between the product of its digits and the sum of its digits.
class Solution {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            sum += n%10;
            product *= n%10;
            n/=10;

        }
        return product - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        // System.out.println(subtractProductAndSum(n));
        // int n*n = 125;
        System.out.println(n);
    }
}