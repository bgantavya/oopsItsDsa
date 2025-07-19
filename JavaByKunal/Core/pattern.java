class pattern{
    // 4 4 4 4 4 4 4
    // 4 3 3 3 3 3 4
    // 4 3 2 2 2 3 4
    // 4 3 2 1 2 3 4
    // 4 3 2 2 2 3 4    
    // 4 3 3 3 3 3 4
    // 4 4 4 4 4 4 4
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= 2*n-1; i++) {
            for(int j = 1; j <= 2*n-1; j++) {
                int element = Math.min(Math.min(i-1,j-1), Math.min(2*n-i-1, 2*n -j-1));
                System.out.print(n-element + " ");
            }
            System.out.println();
        }
    }
}