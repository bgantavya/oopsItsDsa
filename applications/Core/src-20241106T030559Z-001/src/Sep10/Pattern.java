package Sep10;

public class Pattern {
    public static void main(String[] args) {
        int c = 0;
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(Fact(i) / ((Fact(i - j) * Fact(j))) + "    ");
            }
            System.out.println();
        }
    }
    public static int Fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }
}
