//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw5q4 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your 3x3 matrix: ");
        double matrix[][] = new double[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int n = 0; n <= 2; n++) {
                matrix[i][n] = stdin.nextDouble();
            }
        }
        double matrix2[][] = sortRows(matrix);
        for (int i = 0; i <= 2; i++) {
            System.out.println("");
            for (int n = 0; n <= 2; n++) {
                System.out.print(matrix2[i][n] + " ");
            }
        }
    }
    public static double[][] sortRows(double[][] m) {
        double temp;
        for(int i = 0; i<3;i++){
            for (int j = 0; j < 3; j++) {
                for (int n = 0; n < 2; n++) {
                    if (m[i][n] > m[i][n + 1]) {
                        temp = m[i][n];
                        m[i][n] = m[i][n + 1];
                        m[i][n + 1] = temp;
                    }
                }
            }
        }
        return m;
    }
}