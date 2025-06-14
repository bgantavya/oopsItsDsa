// brute force
// public class stockPrice{
//     public static void main(String[] args) {
//         int arr[] = {13,24,43,23,13,35,31,43,21};
//         int profit = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if(profit < arr[i]-arr[j]){
//                     profit =  arr[i]-arr[j];
//                 }
//             }
            
//         } 
//         System.out.println("Max Profit that can be obtained: "+profit);
//     }
// }





// optimised code
public class stockPrice{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        int buy=0,profit = 0;
        for (int i = 0; i < arr.length; i++) {
                if(buy > arr[i]){
                    buy =  arr[i];
                }
                profit = Math.max(profit,arr[i]-buy);

            
        } 
        System.out.println("Max Profit that can be obtained: "+profit);
    }
}
