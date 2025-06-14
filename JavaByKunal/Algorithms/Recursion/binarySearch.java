public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int target = 2;
        int low = 0;
        int high = arr.length;
        int a = sort(low, high, arr, target);
        System.out.println(a);
    }
    static int sort(int low, int high, int[] nums, int target){
        if(low > high) return -1;
        int mid = low + (high - low) /2;
        if(nums[mid] < target) sort(low, mid, nums, target);
        else if(nums[mid] > target) sort(low, mid, nums, target);
        else return mid;
        return 0;
    }
}
