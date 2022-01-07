
import java.util.Scanner;
public class Lab6q2 {
    public static void main(String[] args) {
        double d, mpg, ppg, c, g;
        System.out.print("Enter the driving distance: ");
        Scanner stdin = new Scanner(System.in);
        d = stdin.nextDouble();
        System.out.print("Enter miles per gallon: ");
        mpg = stdin.nextDouble();
        System.out.print("Enter price per gallon: ");
        ppg = stdin.nextDouble();
        g = d / mpg;
        c = g * ppg;
        System.out.printf("Your cost is $%.2f %n", c);
    }
}
