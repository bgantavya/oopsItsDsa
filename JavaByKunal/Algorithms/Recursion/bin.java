class bin{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,34};
        int target = 3;
        int a = bins(0, arr.length -1, target, arr);
        System.out.println(a);
    }
    static int bins(int start, int end, int target, int[] arr){
        if(start > end) return end;
        int mid = start + (end-start)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) end = mid-1;
        else start = mid+1;
        return bins(start, end, arr, target);
    }
}