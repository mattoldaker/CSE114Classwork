//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw2q2 {
    public static void main(String[] args) {
        int l, u, a, n, b, c, cd, d, dd, f = 0;
        String s;
        System.out.print("Enter your lower limit: ");
        Scanner stdin = new Scanner(System.in);
        l = stdin.nextInt();
        System.out.print("Enter your upper limit: ");
        u = stdin.nextInt();
        System.out.print("the Armstrong numbers between " + l + " and " + u + " are: ");
        for (a = l; a <= u; a++) {
            s = Integer.toString(a);
            n = s.length();
            f = 0;
            for (b = 1; b <= n; b++) {
                c = (int) (a % Math.pow(10, b - 1));
                cd = (int) (a % Math.pow(10, b));
                d = cd - c;
                dd = (int) ((d) / Math.pow(10, b - 1));
                f = (int) Math.pow(dd, n) + f;
            }
            if (f == a) {
                System.out.print(f + " ");
            } else {

            }
        }
    }
}

