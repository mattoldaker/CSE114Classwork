import java.util.Scanner;
public class Lab6q1 {
    public static void main(String[] args) {
        double x ;
        int i , d1 , d2, d3, p;
        System.out.print("Enter a 3 digit positive integer: ");
        Scanner stdin = new Scanner(System.in);
        i = stdin.nextInt();

        d1 = i % 100;
        d2 = d1 % 10;
        d3 = d2 % 1;

        d3 = d2 - d3;
        d2 = d1 - d2;
        d1 = i - d1;

        d1 = d1/100;
        d2 = d2/10;

        d3 = d3 * 100;
        d2 = d2 * 10;

        p = d1 + d2 +d3;

        if (i == p){
            System.out.println( i + " is a palindrome");
        } else {
            System.out.println(  i + " is NOT a palindrome");
        }
    }
}
