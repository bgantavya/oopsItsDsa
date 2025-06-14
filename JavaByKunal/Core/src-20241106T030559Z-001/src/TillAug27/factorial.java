package TillAug27;

public class factorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(Fact(n));
    }
    public static int Fact(int n) {
        int f = 1;
        for(int i = 1;i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
