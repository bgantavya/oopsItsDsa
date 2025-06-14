public class butterflyPatternn {
        public static void main(String[] args) {
            int n = 5;
    
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" \t");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            for (int i = 2; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" \t");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
}
