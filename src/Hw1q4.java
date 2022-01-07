// Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw1q4 {
    public static void main(String[] args) {
        double s1, s2, s3;
        System.out.print("Enter the 3 sides of your triangle: ");
        Scanner stdin = new Scanner(System.in);
        s1 = stdin.nextDouble();
        s2 = stdin.nextDouble();
        s3 = stdin.nextDouble();
        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            System.out.println("Invalid Input!");
        } else if (((s1 + s2) <= s3) ^ ((s1+s3) <= s2) ^ ((s2 + s3) <= s1)) {
            System.out.println("Invalid Input!");
        } else if ((s1 == s2) && (s2 == s3)) {
            System.out.println("Equilateral");
        } else if ((s1 != s2) && (s2 != s3)) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
        }
    }
}