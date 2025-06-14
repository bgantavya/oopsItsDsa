// take an arr fro user and print all elements pairs whose sum === t
import java.util.*;
public class input{
    public static void main(String[] args){
        int[] myarr = {5,15,20,35,45,65,80};

        Scanner sc = new Scanner(System.in);
        int target = 80;
        int n = 7;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if(myarr[i]!=myarr[j]){
                    if(target == myarr[i] + myarr[j]){
                        System.out.println("("+myarr[i]+","+myarr[j]+")");
                        n = n - 1;
                    }
                }
            
        }
    }
}}
