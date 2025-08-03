import java.util.*;

public class main{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,34,896,65,2,31,32,23,24,3,2,3,12};
        mergeSort(nums, 0, nums.length);
        System.out.print(Arrays.toString(nums));
        
    }
    public static void mergeSort(int[] nums, int start, int end){
        if(end - start == 1) return;
        int mid = start + (end - start) /2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);
        merge(nums, start, mid, end);
    }


    static void merge(int[] nums, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(nums[i] < nums[j]){
                mix[k] = nums[i];
                i++;
            } else{
                mix[k] = nums[j];
                j++;

            }
            k++;
        }

        while(i < mid){
            mix[k] = nums[i];
            i++;
            k++;
        } while(j < end){
            mix[k] = nums[j];
            j++;
            k++;
        }

        for(int l = 0; l < mix.length; l++){
            nums[start+l] = mix[l];
        }
    }
}