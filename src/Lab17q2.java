import java.util.Scanner;
public class Lab17q2 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a 3-by-3 matrix row by row:");
        Double[][] array = new Double[3][3];
        for(int i = 0; i<3;i++){
            for(int n = 0; n<3;n++){
                array[i][n] = stdin.nextDouble();
            }
        }
        if(isMarkovMatrix(array)==true){
            System.out.print("It is a Markov matrix");
        }else{
            System.out.print("It is not a Markov matrix");
        }
    }
    public static boolean isMarkovMatrix(Double[][] m){
        for(int i = 0; i<m.length;i++){
            double temp = 0;
            for(int n = 0; n<3;n++){
                if(m[n][i]>0){
                    temp = temp + m[n][i];
                }
            }
            if(temp!=1){
                return false;
            }
        } return true;
    }
}
