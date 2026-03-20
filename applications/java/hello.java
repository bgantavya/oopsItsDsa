
import java.util.Scanner;


public class hello{
    public int checkPrime(int num){
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                ++count;
            }
            if (count>2){
                break;
            }
        }
        String ans = "answer";
        if (count<3 || num == 1 || num == 0){
            ans = "Prime";
        }
        else{
            ans =  "Not Prime";
        }
        System.out.println(ans);
    }






    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkprime(num);
        sc.close();









        }
    }



