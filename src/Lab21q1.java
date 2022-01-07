import java.util.Scanner;
public class Lab21q1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your # of rows");
        int row = stdin.nextInt();
        System.out.println("Enter your # of columns");
        int column = stdin.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter your matrix");
        for (int i = 0; i < row; i++) {
            for (int n = 0; n < column; n++) {
                matrix[i][n] = stdin.nextInt();
            }
        }
        sort(matrix);
        for (int i = 0; i < row; i++) {
            for (int n = 0; n < column; n++) {
                System.out.println(matrix[i][n]);
            }
        }
    }
    public static void sort(int[][] m){
        int temp;
        for(int i = 0;i<m[0].length;i++){
            for(int n = 0;n<m[0].length-1;n++){
                if(m[i][n]>m[i][n+1]){
                    temp = m[i][n];
                    m[i][n]=m[i][n+1];
                    m[i][n+1]=temp;

                }
            }
        }
    }
}
