import java.util.Scanner;
public class Lab7q2 {
    public static void main(String[] args) {
        double n,s,A;
        System.out.print("Enter the number of sides: ");
        Scanner stdin = new Scanner(System.in);
        n = stdin.nextDouble();
        System.out.print("Enter the side length: ");
        s = stdin.nextDouble();
        A = ((n * (Math.pow(s,2)))/(4*(Math.tan((Math.PI)/n))));
        System.out.println("The area of the polygon is: " + A);
    }
}