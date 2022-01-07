import java.util.Scanner;
public class Lab3q1 {
    public static void main(String[] args) {
        double C,F;
        System.out.print("Enter the temperature in Celsius degrees: ");
        Scanner stdin = new Scanner(System.in);
        C = stdin.nextDouble();
        F = (9.0 / 5) * C + 32.0;
        System.out.println("The temperature in Fahrenheit degrees is: " + F);

    }
}
