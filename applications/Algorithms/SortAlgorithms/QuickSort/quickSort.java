import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        int[] nums = {1,2, 3,4,34,896,65,2,31,32,23,24,3,2,3,12};
        QuickSort(nums, 0, nums.length-1);
        System.out.print(Arrays.toString(nums));
    }

    static void QuickSort(int[] nums, int start, int end){

        if (start >= end) return;
        int s = start;
        int e = end;
        int m = s + (e-s) /2;
        int pivot = nums[m];     
        while(s <= e){
            while(pivot > nums[s]) s++;
            while(pivot < nums[e]) e--;
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(nums, start, e);
        QuickSort(nums, s, end);
    }
}
