
import java.util.Arrays;

public class selectionSort{
    public static void main(String[] args) {
        int[] nums = {123, 434, 34, 2, 12, 3, 23, 24, 3, 43, 421, 23};
        sort(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void sort(int[] nums){
        for( int i = 0; i < nums.length -1; i++){
            int last =  nums.length -1 -i;
            int max = findMax(nums, 0, last);
            swapIt(nums, max, last);
        }
    }
    static int findMax(int[] nums, int start, int end){
        int max = start;
        for(int i = start + 1; i <= end; i++ ){
            if(nums[max] < nums[i]) max = i;
        }
        return max;
    }
    static void swapIt(int[] nums, int element, int last){
        int temp = nums[element];
        nums[element] = nums[last];
        nums[last] = temp;
    }
}
