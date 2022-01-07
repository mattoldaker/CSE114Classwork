//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw2q4 {
    public static void main(String[] args) {
        System.out.print("Enter the input string: ");
        Scanner stdin = new Scanner(System.in);
        String S = " ";
        S = stdin.next();
        S += stdin.nextLine();
        String Sl = S.toLowerCase();
        Sl = Sl.replaceAll("\\s", "");
        int a, l = Sl.length();
        for (a = 0; a < l; a++) {
            if (Sl.codePointAt(a) == Sl.codePointAt(l - a - 1)) {
            } else {
                System.out.println("Input string " + S + " is NOT a palindrome!");
                a = l;
            } if ( a == (l-1)){
                System.out.print("Input string " + S + " is a palindrome!");
            }
        }
    }
}

