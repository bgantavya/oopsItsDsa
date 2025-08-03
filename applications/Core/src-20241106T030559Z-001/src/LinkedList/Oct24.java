package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Oct24 {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(10, 30, 40, 100, 80, 20));
        System.out.println(li);
        li.add(69);
        System.out.println(li);
        li.remove(6);
        System.out.println(li);
    }
}
