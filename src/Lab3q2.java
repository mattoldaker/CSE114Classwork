import java.util.Scanner;
public class Lab3q2 {
    public static void main(String[] args) {
        double Q, M, Ft, It;
        System.out.print("Enter the mass of the water (Kg): ");
        Scanner stdin = new Scanner(System.in);
        M = stdin.nextDouble();
        System.out.print("Enter the initial temperature (C): ");
        It = stdin.nextDouble();
        System.out.print("Enter the final temperature (C): ");
        Ft = stdin.nextDouble();
        Q = M * (Ft - It) * 4184;
        System.out.println("The energy needed is: " + Q);
    }
}