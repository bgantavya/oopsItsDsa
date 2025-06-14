package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Oct24 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new TreeSet<>();
        Set<Integer> s3 = new LinkedHashSet<>();
        s1.add(45);
        s1.add(50);
        s1.add(88);
        s2.add(45);
        s2.add(50);
        s2.add(88);
        s3.add(45);
        s3.add(88);
        s3.add(50);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
