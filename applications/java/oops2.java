import java.util.Scanner;
 public class oops2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int numbers = 2;
        int count =0;
        while(count<n){
            int flag = 1; 
            for (int i = 2; i*i <=numbers; i++) {
                if(numbers%i==0){
                    flag = 0;
                    break;
            }
        }
            if (flag==1){
                System.out.println(numbers);
                count++;
            }
            numbers++;
        
        sc.close();}
    }
 }