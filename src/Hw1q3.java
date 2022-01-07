// Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw1q3 {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter an integer: ");
        Scanner stdin = new Scanner(System.in);
        a = stdin.nextInt();
        boolean uno = (a % 5 == 0);
        boolean dos = (a % 6 == 0);
        System.out.println("Divisible by 5 and 6?: " + (uno == true && dos == true));
        System.out.println("Divisible by 5 or 6?: " + (uno == true || dos == true));
        System.out.println("Divisible by 5 or 6, but not both?: " + (uno != dos));

    }
}
