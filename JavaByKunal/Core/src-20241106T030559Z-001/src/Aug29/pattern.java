package Aug29;

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(n-i); k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        int c = 1;
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < i; j++) {
//                System.out.print(c+"   ");
//                c++;
//            }
//            System.out.println();
//        }

//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < i; j++) {
//                System.out.print("*   ");
//            }
//            System.out.println();
//        }
    }
}
