import java.util.Scanner;
public class Lab15q2 {
    public static void main(String[] args){
        double[] List = new double[10];
        System.out.println("Enter ten numbers: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            List[i] = scan.nextDouble();
        }
        reverse(List);
        for(int i = 0;i<10;i++) {
            System.out.print(List[i]+" ");
        }
    }
    public static double[] reverse(double[] List){
        for(int i = 0;i<5;i++){
            double c = List[i];
            List[i]=List[9-i];
            List[9-i] = c;
        }
        return List;
    }
}
