package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;
import java.util.*;
public class evenDigits1295 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,45,4,2,9,42,5,45,3,13,4,14,65,4,58};
        int ans = findEven(arr);
        System.out.print(ans);
    }
    static int findEven(int[] arr){
        int count = 0;
        for(int num : arr ){
            if(isEven2(num)) count++;
        }
        return count;
    }
    static boolean isEven1(int num){
        int c=1;
        while(num>10){
            num/=10;
            c++;
        }
        // int n = ((String)num).length();
        if(c%2==0) return true;
        else return false;
    }
    static boolean isEven2(int num){
        int c = (int)Math.log10(num) +1 ;
        if(c%2==0) return true;
        else return false;
    }
    static boolean isEven3(int num){
        // verify via string method
        if(c%2==0) return true;
        else return false;
    }
}
