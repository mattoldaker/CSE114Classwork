import java.util.Scanner;
public class Lab15q1 {
    public static void main(String[] args) {
        double[] List = new double[10];
        System.out.println("Enter ten numbers: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            List[i] = scan.nextDouble();
        }
        System.out.println("The mean is " + mean(List));
        System.out.println("The standard deviation is " + deviation(List));
    }
    public static double mean(double[] x) {
        double numerator = 0;
        for (int a = 0; a < 10; a++) {
            numerator = numerator + x[a];
        }
        double mean;
        mean = numerator/10;
        return mean;
    }
    public static double deviation(double[] x){
        double numerator = 0;
        for(int i = 0; i<10;i++){
            double xi = Math.pow(x[i]-mean(x),2);
            numerator = xi + numerator;

        }
        double deviation = Math.sqrt(numerator/9);
        return deviation;
    }
}