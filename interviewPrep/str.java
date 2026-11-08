// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String a = "1231";
        char k = '1';
        int n = a.length();
        int max = 0;
        for(int i = 0; i < n; i++){
            if(a.charAt(i) == k){
                String newNum = a.substring(0, i) + a.substring(i + 1, n);
                int num = Integer.parseInt(newNum);
                max = Math.max(max, num);
            }
        }
        System.out.print(max);
    }
}