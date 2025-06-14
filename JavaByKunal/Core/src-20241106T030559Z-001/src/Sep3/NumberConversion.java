package Sep3;

public class NumberConversion {
    public static void main(String[] args) {
        int n = 1100;
        System.out.println(deciToHex(254));
    }


    // bin to decimal
    public static int Deci(int n) {
        int num = 0;
        int i = 0;
        int l = 0;
        while(n > 0) {
            l = n % 10;
            num = num + (int)(l * Math.pow(2,i));
            n = n / 10;
            i++;
        }
        return num;
    }


    //octa to deci
    public static String OctaBin(int n) {
        int num = 0;
        int i = 0;
        int l = 0;
        while(n > 0) {
            l = n % 10;
            num = num + (int)(l * Math.pow(8,i));
            n = n / 10;
            i++;
        }
        return DeciBin(num);
    }
    //deci to bin
    public static String DeciBin(int n) {
        String ans = "";
        while (n > 0) {
            ans = (n % 2) + ans;
            n = n / 2;
        }
        return ans;
    }

    // deci to hexa
    public static String deciToHex(int n) {
        String ans = "";
        while (n > 0) {
            int l = n % 16;
            char num;
            if (l <= 9) {
                num = (char)(l);
            } else {
                num = (char)('A' + (l - 10));
            }
            ans = num + ans;
            n /= 16;
        }
        return ans;
    }

}



// 1. Decimal to Binary
//String binaryString = Integer.toBinaryString(int decimalNumber);

// 2. Binary to Decimal
//int decimalNumber = Integer.parseInt(String binaryString, 2);

// 3. Decimal to Octal
//String octalString = Integer.toOctalString(int decimalNumber);

// 4. Octal to Decimal
//int decimalNumber = Integer.parseInt(String octalString, 8);

// 5. Decimal to Hexadecimal
//String hexString = Integer.toHexString(int decimalNumber);

// 6. Hexadecimal to Decimal
//int decimalNumber = Integer.parseInt(String hexString, 16);