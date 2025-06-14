
import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int dividend, divisor;
        if(a>b){
            divisor=b;
            dividend=a;
        }
        else{
            divisor=a;
            dividend=b;

        }
        int quotient, remainder;
        while(true){
            quotient = dividend/divisor;
            remainder = dividend%divisor;
            if (remainder==0){
                break;
            }
            dividend = quotient;
            divisor = remainder;
        }
        System.out.println(quotient);
    }
    
}
