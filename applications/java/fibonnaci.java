
// import java.util.Scanner;

// public class fibonnaci{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int c,b =1,a=0;
//         int n = sc.nextInt();
//         int [] pos = new int[n];
//         for (int i = 0; i <pos.length; i++) {
//             c = b;
//             b = a;
//             a = b + c;
//             pos[i] = a;
//         }
//         System.out.println(pos[n-1]);
//     }
// }



import java.util.Scanner;
public class fibonnaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c,b =1,a=0;
        int n = sc.nextInt();
        boolean found = false;
        // int [] pos = new int[n];
        while(n>=a){
            c = b;
            b = a;
            a = b + c;
            if(n == a){
                System.out.println("yes");
                found = true;
                break;
            }
        }
        if (found==false){System.out.println("no");}
    }
}