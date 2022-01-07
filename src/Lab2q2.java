package com.company;
import java.util.Scanner;
public class Lab2q2 {

    public static void main(String[] args) {
        double S,E,T,A;

        System.out.print("Enter the Starting Velocity (m/s): ");
        Scanner stdin = new Scanner(System.in);
        S = stdin.nextDouble();
        System.out.print("Enter the Ending Velocity (m/s): ");
        E = stdin.nextDouble();
        System.out.print("Enter the Time Span (s): ");
        T = stdin.nextDouble();
        A = (E - S) / T;
        System.out.println("The acceleration is: " + A + " m/s^2");
        stdin.close();
    }
}