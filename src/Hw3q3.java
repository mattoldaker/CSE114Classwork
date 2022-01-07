//Matthew Oldaker 112822208
public class Hw3q3 {
    public static void main(String[] args) {
        int emirpcounter=1;
        int n = 1;
        while(emirpcounter<=100){
            int width = 0;
            while(width<10) {
                int nb = n;
                nb = reverser(n);
                String s = String.valueOf(n);
                if (palindrome(s) == false && prime(n) == true && prime(nb) == true) {
                    System.out.print(n + " ");
                    emirpcounter++;
                    n++;
                    width++;
                } else {
                    n++;
                }
            }System.out.println("");
        }
    }
    //Palindrome checker
    public static Boolean palindrome(String s) {
        int length = s.length();
        int a;
        for (a = 0; a < length; a++) {
            if (s.codePointAt(a) == s.codePointAt(length - a - 1)) {
            } else {
                return false;
            }
            if (a == (length - 1)) {
                return true;
            }
        }
        return null;
    }
    //Prime Status checker
    public static Boolean prime(int n){
        double nd = Double.valueOf(n);
        for (double a = 2; a <= (n/2);a++){
            if (nd%a==0){
                return false;
            }
        }
        return true;
    }
    //number reverser
    public static int reverser(int n){
        int nb=0;
        while(n>0) {
            int a = n % 10;
            nb = nb * 10 + a;
            n = n / 10;
        }
        return nb;
    }
}