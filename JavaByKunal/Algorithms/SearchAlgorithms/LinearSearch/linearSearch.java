package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;
public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {1,3,7,10,12};
        int target = 121;
        int index = linearSearch(nums, target);
        boolean found = searchInside(nums, target);
        System.out.println("Index of target: " + index);
        System.out.println("Found: " + found);
    }
    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    static boolean searchInside(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]) return true;
        }
        return false;
    }
}
