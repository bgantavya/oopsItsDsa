
import java.util.Arrays;
// binary search index value finder
public class BinarySearch{
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5,6,76,77,78,81,734,989,2223};
        // int[] nums = {334344,10000,9876,8000,7464,233,120,67,47,45,34};
        int target = 67;
        int atIndex;
        if(nums[0] < nums[nums.length -1]) atIndex = ascBinarySearch(nums, target);
        else atIndex = descBinarySearch(nums, target);
        // System.out.println(nums);
        System.out.println(atIndex);
    }
// if the array is sorted in ascending order
    static int ascBinarySearch(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int mid;
        while(low <= high){
            mid = low + (high-low)/2;
            if(nums[mid] > target ) high = mid - 1;
            else if(nums[mid] < target ) low = mid + 1;
            else return mid;
        }
        return -1;
    }
// if the array is sorted in descending order
    static int descBinarySearch(int[] nums, int target){
        int high = nums.length - 1;
        int low = 0;
        int mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] > target) low = mid + 1;
            else if(nums[mid] < target) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}