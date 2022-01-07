//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw2q3 {
    public static void main(String[] args) {
        String s1, s2, s11, s22;
        int s1l, s2l, a, r, s1v, s2v;

        System.out.print("Enter your first string: ");
        Scanner stdin = new Scanner(System.in);
        s1=" ";
        s1 = stdin.next();
        s1+=stdin.nextLine();

        System.out.print("Enter your second string: ");
        s2=" ";
        s2 = stdin.next();
        s2+=stdin.nextLine();

        s1l = s1.length();
        s2l = s2.length();
        if (s1.codePointAt(0) != s2.codePointAt(0)) {
            System.out.println(s1+" and "+s2+" Have no common prefix");
        }else{
            if (s1l <= s2l) {
                for (a = 0; a < s1l; a++) {
                    if (s1.codePointAt(a) == s2.codePointAt(a)) {
                    } else {
                        s11 = s1.substring(0, a);
                        System.out.println("The common prefix is: " + s1.substring(0, a));
                        a = s1l;
                    }
                }
            } else {
                for (a = 0; a < s2l; a++) {
                    if (s1.codePointAt(a) == s2.codePointAt(a)) {
                    } else {
                        s22 = s2.substring(0, a);
                        System.out.println("The common prefix is: " + s2.substring(0, a));
                        a = s2l;
                    }
                }
            }
        }
    }
}

