import java.util.Scanner;
public class Lab14q1 {
    public static void main(String[] args){
        System.out.println("Enter your side length:");
        Scanner stdin = new Scanner(System.in);
        double side = stdin.nextDouble();
        System.out.println("Your pentagon's area is "+area(side));
    }
    public static double area(double side){
        double A = (5*side*side)/(4*Math.tan(Math.PI/5));
        return A;
    }
}
