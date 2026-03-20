package Sep19;

import OOP.Sep19.student;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //09:08:00 am
        int index0 = (int)s.charAt(0) - '0';
        int index1 = (int)s.charAt(1) - '0';
        int hh = index0 * 10 + index1;

        if(s.charAt(9) == 'a') {
            if(hh == 12) {
                System.out.println("00"+s.substring(3,8));
            }
        } else {
        }
    }
}
