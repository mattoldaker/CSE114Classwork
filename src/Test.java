import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++){
            System.out.print(getPentagonalNumber(i)+" ");
        }
    }
    public static int getPentagonalNumber(int n){
        n = n*(3*n-1)/2;
        return n;
    }
}
