import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > 0; j--) {
                if(nums[j] < nums[j-1]) swap(nums,j,j-1);
            }
        }
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
