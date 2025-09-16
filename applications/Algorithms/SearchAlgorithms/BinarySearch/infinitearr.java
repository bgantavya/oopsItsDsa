// package JavaByKunal.Algorithms.SearchAlgorithms.BinarySearch;

public class infinitearr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,34,36,45,45,46,57,68,70,80,97,183,193,211,234,341,2322};
        int target = 23;
        int val = searchinfinity(arr,target);
        System.out.println("Element found at index: " + val);
    }
    static int searchinfinity(int[] nums, int target){
        int  start = 0;
        int end = 2;
        while (target > nums[end]) {
            start = end +1;
            end = end*2;
        }
        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start) /2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target) end = mid-1;
            else start = mid + 1;
        }
        return -1;
    }
}
