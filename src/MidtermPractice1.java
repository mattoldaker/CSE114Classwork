import java.util.Scanner;
public class MidtermPractice1 {
    public static void main(String[] agrs){
        System.out.println("enter your n value");
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] fib = new int[n];
        int[] newfib = fibonacci(fib);
        for(int i = 0; i<n;i++){
            System.out.print(newfib[i]+" ");
        }
    }
    public static int[] fibonacci(int[] a){
        int n = a.length+2;
        int newfib[] = new int[n];
        newfib[0]=0;
        newfib[1]=1;
        for (int i = 2;i<n;i++){
            newfib[i]=newfib[i-1]+newfib[i-2];
        }
        return newfib;
    }
}
