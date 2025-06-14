import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
        int[] test = bubbleSort(arr);
        System.out.println(Arrays.toString(test));
        // if (arr == test) {
        //     System.out.println("Array is sorted");
        // } else {
        //     System.out.println("Array is not sorted");
        // }
    }

    static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n -i -1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[+1] = temp;
                }
            }
       }
       return nums;
    }
}