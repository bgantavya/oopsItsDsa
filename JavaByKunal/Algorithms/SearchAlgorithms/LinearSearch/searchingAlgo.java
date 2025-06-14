package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;


public class searchingAlgo{
    // public non-static String lSAlgo( int[] arr, int target, int n) {
		
		
		
    // }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target =3;
        int n = 5;
        int i =0;
        for( i=0;i<n;i++ ){
			if ( arr[i] == target ) {
				System.out.print("result found at index: " + i);
				break;
			}
        }
		if (i==n-1){
			System.out.print("result not found");
		}
        // lSAlgo( arr, target, n );
        // System.out.println(result);

    }

}