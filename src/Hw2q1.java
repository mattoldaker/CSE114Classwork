//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw2q1 {
    public static void main(String[] args) {
        int ul, n, x, y;
        String u;
        System.out.print("Enter your upper limit: ");
        Scanner stdin = new Scanner(System.in);
        ul = stdin.nextInt();
        System.out.println("The perfect numbers below " + ul + " are: ");
        for (n = 1; n < ul; n++) {
            y = 0;
            for (x = 1; x < n; x++) {
                if (n % x == 0) {
                    y = y + x;
                } else {
                }
            }
            if (y == n) {
                System.out.print(y +" ");
            } else {
            }
        }
    }
}

