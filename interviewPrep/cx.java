// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) arr.add(sc.nextInt());
        int cx = 0;
        Collections.sort(arr);
        while(!arr.isEmpty()){
            if(!arr.get(0).equals(arr.get(arr.size()-1))){
                arr.remove(arr.size()-1);
            } 
            if(!arr.isEmpty()) arr.remove(0);
            cx++;
        }
        System.out.print(cx);

    }
}