import java.util.Scanner;
public class Lab7q1 {
    public static void main(String[] args) {
        double x,y;
        System.out.print("Enter a point with two coordinates: ");
        Scanner stdin = new Scanner(System.in);
        x = stdin.nextDouble();
        y = stdin.nextDouble();
        if (Math.sqrt((Math.pow(x,2)+Math.pow(y,2)))<=10) {
            System.out.println("Point " + x + ", " + y +" is in the circle");
        } else {
            System.out.println("Point " + x + ", " + y +" is NOT in the circle");
        }
    }
}
