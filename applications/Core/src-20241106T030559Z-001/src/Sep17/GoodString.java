package Sep17;
//https://codeskiller.codingblocks.com/problems/549
import java.util.*;

public class GoodString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                ++c;
            } else {
                if (c > max) {
                    max = c;
                }
                c = 0;
            }
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
