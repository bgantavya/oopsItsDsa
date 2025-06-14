import java.util.ArrayList;
public class Solution {
    public int max(ArrayList<Integer> nums){
        int sum = 0;
        boolean flag = false;
        int n = -1;
        for(int i = nums.size()-1; i <= 0; i--){
            int a = nums.get(i);
            if(flag == true && a == n) a = 9;
            else if(a != 9 && flag == false){
                n = a;
                flag = true;
                a = 9;
            }
            sum = (sum + a)*10;
            System.out.println(sum);
        }

        return sum/10;

    }
    public int min(ArrayList<Integer> nums){
        boolean flag = false;
        int n = -1;
        int sum = 0;
        for(int i = nums.size()-1; i <= 0; i--){
            int a = nums.get(i);
            if(flag == true && a == n) a = 0;
            else if(a != 0 && flag == false){
                n = a;
                flag = true;
                a = 0;
            }
            sum = (sum + a)*10;
            System.out.println(sum);
        }
        return sum/10;
    }
    public int minMaxDifference(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
        while(num > 0){
            nums.add(num%10);
            num/=10;
        }
        
        return max(nums) - min(nums);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minMaxDifference(1234)); // Example usage
    }
}