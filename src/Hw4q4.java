//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw4q4 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        matrix1 = getmatrix(matrix1, 1);
        matrix2 = getmatrix(matrix2, 2);
        double[][] product = multiplyMatrix(matrix1,matrix2);
        System.out.println("Multiplication of the matrices is:");
        System.out.println(product[0][0]+" "+product[0][1]+" "+product[0][2]);
        System.out.println(product[1][0]+" "+product[1][1]+" "+product[1][2]);
        System.out.println(product[2][0]+" "+product[2][1]+" "+product[2][2]);
    }public static double[][] multiplyMatrix(double a[][],double b[][]){
        double[][] c= new double[3][3];
        for(int l=0;l<3;l++){
            for(int w=0;w<3;w++){
                c[l][w]=a[l][0]*b[0][w]+a[l][1]*b[1][w]+a[l][2]*b[2][w];
            }
        }return c;
    }public static double[][] getmatrix(double matrix[][],int num){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter Matrix "+num);
        for(int i = 0;i<3;i++) {
            for (int n = 0; n < 3; n++) {
                matrix[i][n] = stdin.nextDouble();
            }
        }return matrix;
    }
}
