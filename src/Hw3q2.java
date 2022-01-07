//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw3q2 {
    public static void main(String[] args) {
        System.out.println("Enter your binary string:");
        Scanner stdin = new Scanner(System.in);
        String binaryString = stdin.next();
        bin2Dec(binaryString);
    }
    public static int bin2Dec(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();
        length--;
        char a = '1';
        char b = '0';
        int place = 0;
        for (int i = length; i >= 0; i--) {
            if (binaryString.charAt(place) == a) {
                decimal = (int) (decimal + (Math.pow(2, i)));
                place++;
            } else if (binaryString.charAt(place) == b) {
                place++;
            } else {
                b = '2';
                break;
            }
        }
        if (b == '2') {
            System.out.print("Not a valid input!");
        } else {
            System.out.print(decimal);
        }
        return decimal;
    }
}
