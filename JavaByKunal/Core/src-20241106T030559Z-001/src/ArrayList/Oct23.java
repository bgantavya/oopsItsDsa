package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// remove all duplicates
public class Oct23 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10, 30, 40, 100, 30, 20, 100, 40));
        for(int i : l) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
        }
        System.out.println(arr);

        // Accessing using Iterator
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
//    for (int i = 0; i < l.size(); i++) {
//      System.out.println(l.get(i));
//    }
//    for(int x: l) {
//      System.out.println(x);
//    }
