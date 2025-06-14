public class ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6,7,8,56,78};
        int target = 45;
        int indexValue = ceiling(arr, target);
        System.out.println(indexValue);
    }
    static int ceiling(int[] nums, int target){
        int ceil = Integer.MAX_VALUE;
        int mid;
        int high = nums.length -1;
        int low = 0;
        int end = 0;
        while(low <= high){
            mid = low + (high - low) /2;
            end  = high;
            // if(target <= nums[mid] && nums[mid]<= ceil)ceil = mid;
            if(nums[mid] > target) high = mid -1;
            else if(nums[mid] < target) low = mid +1;
            else return mid;
        }
        return end;
    }
}
