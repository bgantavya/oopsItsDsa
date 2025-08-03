public class firstlast34{
    public static void main(String[] args){
        
    }
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        int midval = 0;
        int betval = 0;
        boolean flag = false;
        while(low <= high){
            mid = low + (high - low) /2;
            if(nums[mid] >= target ) {
                high = mid -1;
                if(nums[mid] == target ){
                    midval = mid;
                    flag = true;
                }}
            else low = mid +1;
        }
        low = 0;
        high = nums.length -1;
        while(low <= high){
            mid = low + (high - low) /2;
            if(nums[mid] <= target){
                low = mid +1;
                if(nums[mid] == target){
                    betval = mid;
                    flag = true;
                }}
            else high = mid -1;
        }
        if(flag) return new int[] {midval, betval};
        else return new int[] {-1,-1};
    }
}