package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;
public class maxWealth1672 {
    public static void main(String[] args) {
        int[][] nums = {{2,3,43,4,2},{21,434,44,1},{2,31,123,14,231},{213,2,31,4,44}};
        System.out.print(maxWealth(nums)); 
    }
    static int maxWealth(int[][] nums){
        int max = Integer.MIN_VALUE;
        int total = 0;
        
        for(int[] acc : nums){
            for(int money : acc ){
                total += money;
            }
            if(total> max) max = total;
            total = 0;
        }
        return max;
    }
}
