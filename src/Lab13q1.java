import java.util.Scanner;
public class Lab13q1 {
    public static void main(String[] args){
        System.out.println("Enter your n value: ");
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n) {
        for(int i=1;i<=n;i++){
            int remainder = n-i;
            for(int spaces=0;spaces<remainder;spaces++) {
                System.out.print("  ");
            }
            for(int counter = i;counter>=1;counter--){

                System.out.print(counter+ " ");
            }System.out.println("");
        }
    }
}
