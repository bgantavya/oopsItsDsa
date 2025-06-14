package Sep6;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if(sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
