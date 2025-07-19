import java.util.*; 
public class retArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5};
        int t = 4;
        ArrayList<Integer> ans = findAll(arr, t, 0, new ArrayList<Integer>());
        System.err.println(ans);
        System.err.println(findAns(arr, t, 0));
    }
    static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        return findAll(arr, target, index+1, list);
    }
    static ArrayList<Integer> findAns(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelow = findAns(arr, target, index + 1);
        list.addAll(ansFromBelow);
        return list;
    }
}