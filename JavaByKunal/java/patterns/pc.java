import java.util.*;
public class pc {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(y>=-1){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
    }
    
}
