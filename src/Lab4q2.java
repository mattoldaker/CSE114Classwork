import java.util.Scanner;
public class Lab4q2 {
    public static void main(String[] args) {
        double x1,y1,x2,y2,d;
        System.out.print("Enter x1 and y1: ");
        Scanner stdin = new Scanner(System.in);
        x1 = stdin.nextDouble();
        y1 = stdin.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2 = stdin.nextDouble();
        y2 = stdin.nextDouble();
        d = Math.pow((Math.pow(x2-x1,2))+(Math.pow(y2-y1,2)),0.5);
        System.out.println("The distance between these two points is: " + d);
    }
}
