
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ld,newn = 0;
        while(num>0){
            ld = num % 10;
            if (ld ==5){
                ld=0;
            }
            newn = newn * 10 + ld;
            num = num / 10;

        }
        System.out.println(newn);






    }
}
