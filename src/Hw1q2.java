// Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw1q2 {
    public static void main(String[] args) {
        double ta,v,twc;
        System.out.print("Enter a temperature between -58 F and 41 F:");
        Scanner stdin = new Scanner(System.in);
        ta = stdin.nextDouble();
        System.out.print("Enter a wind speed above 2 mph:");
        v = stdin.nextDouble();
        twc = 35.74 + (0.6215 * ta) - (35.75 * (Math.pow(v,0.16))) + ((0.4275) * (ta) * (Math.pow(v,0.16)));
        System.out.println("Your wind-chill temperature is: " + twc);
    }
}