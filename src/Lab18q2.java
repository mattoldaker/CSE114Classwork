import java.util.Scanner;
public class Lab18q2 {
    public static void main(String[] args){
        System.out.println("Enter a 4 by 4 matrix row by row");
        Scanner stdin = new Scanner(System.in);
        double matrix[][]=new double[4][4];
        for(int i = 0; i <4;i++){
            for(int n = 0; n<4;n++){
                matrix[i][n]=stdin.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double diagonal=0;
        for(int i = 0; i< 4;i++){
            diagonal = m[i][i]+ diagonal;
        }
        return diagonal;
    }
}
