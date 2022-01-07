import java.util.Scanner;
public class Lab10q1 {
    public static void main(String[] args){
        System.out.print("Enter your 10 digit phone number: ");
        Scanner stdin = new Scanner(System.in);
        String n = stdin.next();
        String a=n.substring(0,3);
        String b=n.substring(3,6);
        String c=n.substring(6,10);
        System.out.print("("+a+")"+b+"-"+c);
    }
}
