
import java.util.*;

public class searchArr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
        int num = sc.nextInt();
        boolean flag =false;
        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr.length; j++) {
                if(myarr[i][j]==num){
                    System.out.println("index:" + i + " " + j);
                    flag =true;
                }
            }
        }
        if(flag = false){
            System.out.println("Not Available");
        }

    }
}
