import java.util.Scanner;
public class MidtermPractice3 {
    public static void main(String[] args){
        double[] list = new double[9];
        System.out.println("Enter 9 integers");
        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i<9;i++){
            list[i]=stdin.nextDouble();
        }
        double temp;
        for(int i = 0;i<9;i++){
            for(int n = 0;n<8;n++){
                if(list[n]>list[n+1]){
                    temp = list[n];
                    list[n]=list[n+1];
                    list[n+1]=temp;
                }
            }
        }
        System.out.println("The mean is "+mean(list)+" and the median is "+list[4]);
    }
    public static double mean(double[] list){
        int n =list.length;
        double total = 0;
        for(int i = 0; i<n;i++){
            total += list[i];
        }
        double mean = total/n;
        return mean;
    }
}
