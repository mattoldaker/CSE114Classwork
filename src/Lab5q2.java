import java.util.Scanner;
public class Lab5q2 {
    public static void main(String[] args) {
        double w,s;
        System.out.print("Enter the weight of your package (lbs)");
        Scanner stdin = new Scanner(System.in);
        w = stdin.nextDouble();
        if (w > 20 || w <= 0){
            if (w > 20) {
                System.out.println("Your package cannot be shipped!");
            } else if (w <= 0){
                System.out.println("Invalid input!");
            }
        } else {
            if (w > 10) {
                s = 10.5;
            } else if (w > 3) {
                s = 8.5;
            } else if (w > 1) {
                s = 5.5;
            } else {
                s = 3.5;
            } System.out.println("Your shipping price is: $" + s);
        }
    }
}