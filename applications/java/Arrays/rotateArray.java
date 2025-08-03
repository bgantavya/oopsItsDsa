public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >= 1; i--) {
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
