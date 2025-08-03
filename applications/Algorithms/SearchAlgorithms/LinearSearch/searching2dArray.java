package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;
public class searching2dArray {
    public static void main(String[] args){

        int arr[][] = {
            {1,2,3,4,5,6},
            {23,4,5,4,43,32,52,4,3,12,321,23},
            {233,32,23,24,4,45,43,32,41,2,342}
        };
        int target = 32;
        int[] num = search2d(arr,target);
    }
    static int[] search2d(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(target == arr[i][j]) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    }