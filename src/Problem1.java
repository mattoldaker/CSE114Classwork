import java.io.*;
//Matthew Oldaker 112822208
import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) throws IOException {
        int[] list=new int[100];
        File file = new File("integerFile.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        Scanner stdin = new Scanner(file);
        for(int i = 1;i<=100;i++){
            int temp= (int) (Math.random()*101);
            pw.print(temp+" ");
        }
        pw.close();
        for(int i = 0;i<100;i++){
            list[i]=stdin.nextInt();
        }
        int temp;
        for(int i = 0;i<100;i++){
            for(int n = 0;n<99;n++){
                if(list[n]>list[n+1]) {
                    temp = list[n];
                    list[n] = list[n + 1];
                    list[n + 1] = temp;
                }
            }
        }
        for(int i = 0;i<100;i++){
            System.out.print(list[i]+" ");
        }
    }
}