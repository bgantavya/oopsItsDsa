// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {23, 12, 43, 23, 56, 1, 5, 7, 8};
        int n = arr.length;
        int max = 0;
        for(int x = 0; x < n; x++){
            int[] res = new int[n];
            int total = 0;
            int ans = 0;
            for(int i = 0; i < n; i++){
                res[i] = arr[(x+i) % n];
                ans ^= res[i];
                total += ans;
            } max = Math.max(max, total);
        }
        
        for(int x = 0; x < n; x++){
            int[] res = new int[n];
            int total = 0;
            int ans = 0;
            for(int i = 0; i < n; i++){
                res[i] = arr[(x-i+n) % n];
                ans ^= res[i];
                total += ans;
            } max = Math.max(max, total);
        }
        System.out.print(max);
    }
}