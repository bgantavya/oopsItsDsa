import java.util.*;
public class subset{
    public static void main(String[] args) {
        String str = "baccad";
        String ans = retSkip(str);
        System.out.println(ans);
    }

    static void skip(String a, String up){
        if(a.length() == 0) {
            System.out.println(up);
            return;
        }
        if (a.charAt(0) == 'a') skip(a.substring(1), up);
        else skip(a.substring(1), up + a.charAt(0));
    }

    static String retSkip(String a){
        if(a.isEmpty()) {
            return "";
        }
        if (a.charAt(0) == 'a') return retSkip(a.substring(1));
        else return a.charAt(0) + retSkip(a.substring(1));
    }
}
