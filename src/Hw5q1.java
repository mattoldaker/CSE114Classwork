//Matthew Oldaker 112822208
import java.util.Scanner;
class Complex{
    public static void addition(double [] one, double [] two) {
        double three[] = new double[2];
        three[0] = one[0] + two[0];
        three[1] = one[1] + two[1];
        System.out.println("Subtraction of the complex numbers is:("+three[0]+"), ("+three[1]+")");
    }
    public static void subtraction(double [] one, double [] two){
        double three[] = new double[2];
        three[0] = one[0] - two[0];
        three[1] = one[1] - two[1];
        System.out.println("Subtraction of the complex numbers is:("+three[0]+"), ("+three[1]+")");
    }
    public static void display(double[] one){
        System.out.println("Second complex number is: (" + one[0]+"), ("+one[1]+")");
    }
}
public class Hw5q1 {
    public static void main(String[] agrs){
        double n1[] = new double[2];
        double n2[] = new double[2];
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter real part of the first complex number: ");
        n1[0]= stdin.nextDouble();
        System.out.println("Enter imaginary part of the first complex number: ");
        n1[1]= stdin.nextDouble();
        System.out.println("Enter real part of the second complex number: ");
        n2[0]= stdin.nextDouble();
        System.out.println("Enter imaginary part of the second complex number: ");
        n2[1]= stdin.nextDouble();
        Complex.display(n1);
        Complex.display(n2);
        Complex.addition(n1,n2);
        Complex.subtraction(n1,n2);
    }
}
