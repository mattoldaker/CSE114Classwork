import java.util.Scanner;
public class Lab13q2 {
    public static void main(String[] args){
        System.out.println("Enter your integer number: ");
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        reverse(n);
    }
    public static void reverse(int number){
        int rev = 0;
        while(number>0) {
            int a = number % 10;
            rev = rev * 10 + a;
            number = number / 10;
        }System.out.println(rev);
    }
}
