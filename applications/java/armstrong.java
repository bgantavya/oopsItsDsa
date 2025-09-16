
import java.util.Scanner;

public class armstrong{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
    double ld,armn = 0;
    double count = 0;
    for (int i = 0; i < num; i++) {
      count++;
    }
    while(num>0){
      ld = num % 10;
            for (int i = 1; i < num; i++) {
              ld = ld*ld;
              
            }
            armn = armn + ld;
            num = num / 10;
    }
	if (num == armn){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
    
}
}