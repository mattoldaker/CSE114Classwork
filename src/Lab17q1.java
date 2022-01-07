import java.util.Scanner;
public class Lab17q1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array");
        int rows = stdin.nextInt();
        int columns = stdin.nextInt();
        double array[][] = new double[rows][columns];
        System.out.println("Enter the array");
        for (int i = 0; i < rows; i++) {
            for (int n = 0; n < columns; n++) {
                array[i][n] = stdin.nextDouble();
            }
        }
        int[] largest =locateLargest(array);
        System.out.print("The location of the largest element is at ("+largest[0]+"), ("+largest[1]+")");
    }
    public static int[] locateLargest(double[][] a) {
        int maxar[] = new int[2];
        double max = a[0][0];
        int rows = a.length;
        int columns = a[0].length;
        for (int i = 0; i < rows; i++) {
                for (int n = 0; n < columns; n++) {
                    if(max < a[i][n]){
                        double p = a[i][n];
                        max = p;
                        maxar[0]=i;
                        maxar[1]=n;
                }
            }
        }
            return maxar;
    }
}
