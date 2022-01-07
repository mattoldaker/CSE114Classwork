//Matthew Oldaker 112822208
import java.util.Scanner;
class Rational{
    public static String reduce(int[] f){
        String f3s = "";
        int temp[] = new int[2];
        if(f[0]>f[1]){
            for (int i = 2;i<=f[1];){
                if(f[0]%i==0&&f[1]%i==0){
                    f[0]=f[0]/i;
                    f[1]=f[1]/i;
                }else{
                    i++;
                }
            }
        }else{
            for (int i = 2;i<=f[0];){
                if(f[0]%i==0&&f[1]%i==0){
                    f[0]=f[0]/i;
                    f[1]=f[1]/i;
                }else{
                    i++;
                }
            }
        }
        f3s = f[0]+"/"+f[1];
        return f3s;
    }
    public static String add(int[] f1,int[] f2){
        int[] f3 = new int[2];
        f3[0]=f1[0]*f2[1]+f2[0]*f1[1];
        f3[1]=f1[1]*f2[1];
        String f3s = reduce(f3);
        return f3s;
    }
    public static String subtract(int[] f1,int[] f2){
        int[] f3 = new int[2];
        f3[0]=f1[0]*f2[1]-f2[0]*f1[1];
        f3[1]=f1[1]*f2[1];
        String f3s = reduce(f3);
        return f3s;
    }
    public static String multiply(int[] f1,int[] f2){
        int[] f3 = new int[2];
        f3[0]=f1[0]*f2[0];
        f3[1]=f1[1]*f2[1];
        String f3s = reduce(f3);
        return f3s;
    }
    public static String divide(int[] f1,int[] f2){
        int[] f3 = new int[2];
        f3[0]=f1[0]*f2[1];
        f3[1]=f1[1]*f2[0];
        String f3s = reduce(f3);
        return f3s;
    }
}
public class Hw5q2 {
    public static void main(String[] args){
        int f1[]=new int[2];
        int f2[]=new int[2];
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter numerator for the first rational number: ");
        f1[0] = stdin.nextInt();
        System.out.println("Enter a non-zero denominator for the first rational number: ");
        f1[1] = stdin.nextInt();
        System.out.println("Enter numerator for the second rational number: ");
        f2[0] = stdin.nextInt();
        System.out.println("Enter a non-zero denominator for the second rational number: ");
        f2[1] = stdin.nextInt();
        System.out.println("First rational number is: "+ Rational.reduce(f1));
        System.out.println("Second rational number is: " + Rational.reduce(f2));
        System.out.println("Addition of the rational numbers is: "+ Rational.add(f1,f2));
        System.out.println("Subtraction of the rational numbers is: "+ Rational.subtract(f1,f2));
        System.out.println("Multiplication of the rational numbers is: "+ Rational.multiply(f1,f2));
        System.out.println("Division of the rational numbers is: "+ Rational.divide(f1,f2));
    }
}
