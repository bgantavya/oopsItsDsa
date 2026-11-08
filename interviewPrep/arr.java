// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n = 7;
        int[] nums = new int[n+1];
        int max = Integer.MIN_VALUE;
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 0; i <= (n/2); i++){
            nums[2*i] = nums[i];
            nums[(2*i) +1] = nums[i] + nums[i+1];
        }
        for(int i = 0; i < n; i++) max = Math.max(nums[i], max);
        System.out.print(max);
    }
}