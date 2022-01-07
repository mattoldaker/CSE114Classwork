//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw3q1 {
    public static void main(String[] args) {
        System.out.println("Enter your decimal integer:");
        Scanner stdin = new Scanner(System.in);
        int value = stdin.nextInt();
        System.out.println(dec2Bin(value));
    }public static String dec2Bin(int value) {
        String binary = "";
        while (value > 0) {
            int remainder = value % 2;
            value = value / 2;
            if (remainder == 1) {
                binary = 1 + binary;
            } else {
                binary = 0 + binary;
            }
        }return binary;
    }
}