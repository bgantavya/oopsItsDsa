import java.util.Scanner;
// LeetCode Problem 3360: Alice and Bob Play Game
// Alice and Bob play a game where they take turns subtracting a number from n.
class Solution {
    public static boolean canAliceWin(int n) {
        int count = 0;
        int i = 10;
        while(true){
            if(n<i) break;
            n-=i;
            i--;
            count++;
        }
        return (count%2==0) ? false : true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(canAliceWin(n));
    }
}
