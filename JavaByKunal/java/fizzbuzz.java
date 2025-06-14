import java.util.Arrays;
import java.util.Scanner;

public abstract class fizzbuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] myarr = new String[a];
        // for (int i = 1; i <= myarr.length; i++) {
        //     if(i%15==0){
        //         myarr[i-1]="FizzBuzz";
        //     }
        //     else if(i%5==0){
        //         myarr[i-1]="Buzz";
        //     }
        //     else if(i%3==0){
        //         myarr[i-1]="Fizz";
        //     }
        //     else{
        //         myarr[i-1]= Integer.toString(i);
        //     }}
        //     for (int i = 1; i <= myarr.length; i++) {
        //         if(15*(i/15)==i){
        //             myarr[i-1]="FizzBuzz";
        //         }
        //         else if(5*(i/5)==i){
        //             myarr[i-1]="Buzz";
        //         }
        //         else if(3*(i/3)==i){
        //             myarr[i-1]="Fizz";
        //         }
        //         else{
        //             myarr[i-1]= Integer.toString(i);
        //         }
            int cnt3 =1;
            int cnt5 =1;
            for (int i = 1; i <= myarr.length; i++) {
                if(cnt3 ==3 && cnt5 == 5){
                    myarr[i-1] = "FizzBuzz";
                    cnt3=0; 
                    cnt5=0; 
                }
                else if(cnt5 == 5){
                    myarr[i-1] = "Buzz";   
                    cnt5=0; 
                }
                else if(cnt3 ==3){
                    myarr[i-1] = "Fizz";   
                    cnt3=0; 
                }
                else{
                    myarr[i-1] = Integer.toString(i);
                }
                cnt3++;
                cnt5++;
            }
        System.out.println(Arrays.asList(myarr));
    }
}
