import java.util.Scanner;
public class Lab5q1 {
    public static void main(String[] args) {
        double a, b, c, d, r1, r2;
        System.out.print("Enter a, b, and c: ");
        Scanner stdin = new Scanner(System.in);
        a = stdin.nextDouble();
        b = stdin.nextDouble();
        c = stdin.nextDouble();
        d = (Math.pow(b, 2) - (4 * a * c));
        if (a == 0) {
            System.out.println("This Equation is not quadratic, ");
        } else if (d > 0) {
            r1 = ((((-b) + (Math.pow(d,0.5))) / (2 * a)));
            r2 = ((((-b) - (Math.pow(d,0.5))) / (2 * a)));
            System.out.println("Your roots are " + r1 + " and " + r2);
        } else if (d == 0) {
            r1 = ((b) / (2 * a));
            System.out.println("Your root is " + r1);
        } else {
            System.out.println("No real roots");
        }
    }
}