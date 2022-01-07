import java.util.Scanner;
public class Lab4q1 {
    public static void main(String[] args) {
        double b,i,a;
        System.out.print("Enter the balance: ");
        Scanner stdin = new Scanner(System.in);
        b = stdin.nextDouble();
        System.out.print("Enter the annual percentage interest rate (e.g., 4 for 4$: ");
        a = stdin.nextDouble();
        i = (b * (a / 1200));
        System.out.println("You interest for next month is: $" + i);

    }
}
