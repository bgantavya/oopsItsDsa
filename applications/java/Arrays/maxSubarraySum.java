public class maxSubarraySum {
    public static void main(String []args){
        int[] myarr = {4,2,5,7,1,-9};
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < myarr.length; i++) {
            for (int j = i; j < myarr.length; j++) {
                sum = sum + myarr[j];
                if(sum>max){
                    max=sum;
                }
            }
            sum = 0;
            }
        
        System.out.println(max);
    }
}
