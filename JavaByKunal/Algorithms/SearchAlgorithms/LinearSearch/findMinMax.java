package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;
public class findMinMax {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,43,9,7,6,34,4,3,2,1,3,3,5,6};
        int min = findMin(nums);
        int max = findMax(nums);
        System.out.println( min);
        System.out.println( max);
    }
    static int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min) min = num;
        }
        return min;
    }
    static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max ) max = nums[i];
        }
        return max;
    }

    
}