// public class isPalindrome {
//     public static void main(String[] args) {
//         String s1 = "Abaaba"; 
//         boolean is = palindrome(s1);
//         System.out.println(is); 
//     }
//     static boolean palindrome(String s1){
//         s1.toLowerCase();
//         for(int i = 0; i < s1.length(); i++){
//             if(s1.charAt(i) != s1.charAt(s1.length() -1 - i)) return false;
//         }
//         return true;
//     }
// }
public class isPalindrome {
    public static void main(String[] args) {
        String s1 = "Aba, aba"; 
        boolean is = palindrome(s1);
        System.out.println(is); 
    }
    static boolean palindrome(String s1){
        s1 = s1.replaceAll("[^A-Za-z0-9]", "");
        s1 = s1.toLowerCase();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s1.charAt(s1.length() -1 - i)) return false;
        }
        return true;
    }
}