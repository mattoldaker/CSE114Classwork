// Matthew Oldaker 112822208
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {
        double Dp, Lp, Fp;
        int L, D, N;
        System.out.print("How many eggs are you purchasing?");
        Scanner stdin = new Scanner(System.in);
        N = (int) stdin.nextDouble();
        if (N < 0) {
            System.out.println("You cannot order negative eggs!");
        } else if (N < 12) {
            Lp = N * .45;
            System.out.println("You ordered " + N + " Eggs. That's " + N + " Loose eggs at 45 cents for a total of $" + Lp);
        } else if (N >= 12) {
            if (N % 12 == 0) {
                D = (N / 12);
                Dp = (D * 3.25);
                System.out.println("You ordered " + N + " Eggs. That's " + D + " Dozen eggs at $3.25 for a total of $" + Dp);
            } else {
                L = (N % 12);
                D = (N - L);
                Dp = (D * 3.25) / 12;
                Lp = L * .45;
                Fp = Lp + Dp;
                System.out.println("You ordered " + N + " Eggs. That's " + D + " Dozen eggs at $3.25 per dozen and " + L + " Loose eggs at $.45 each for a total of $" + Fp);
            }
        }
    }
}
