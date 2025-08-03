public class sumOfDigits{
    public static void main(String[] args){
        System.out.println(sum(1342));
        System.out.println(prod(1342));
        System.out.println(rev(142,0));
    }
    public static int sum(int num){
        if(num<10){return num;}
        return (num%10) + sum(num /10);
    }
    public static int prod(int num){
        if(num==0){return 1;}
        return (num%10) * prod(num /10);
    }
    public static int rev(int num,int s){
        if(num<10){return num;}
        s = s*10 + num%10;
        return s + rev(num /10,s)*1;
    }

}