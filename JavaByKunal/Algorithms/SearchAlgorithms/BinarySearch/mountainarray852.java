public class mountainarray852 {
    public static void main(String[] args) {
        int[] arr = {1,3,40,125,198,200,420,1000,1000,1100,1132,321,34,33,21,12,1};
        int index = arrayTop(arr);
        System.out.println(arr[index]);
    }
    static int arrayTop(int[] nums){
        int low =0;
        int high =nums.length -1;
        while(low < high){
            int mid = low + (high - low) /2;
            if(nums[mid] > nums[mid+1]){
                //decreasing part just confirm left
                high = mid;
            }
            else{
                // ascending part lets move towards right
                low = mid +1;
            }
        }
        return high;
    }
}
