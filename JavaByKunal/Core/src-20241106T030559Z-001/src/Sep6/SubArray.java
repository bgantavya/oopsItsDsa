package Sep6;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
