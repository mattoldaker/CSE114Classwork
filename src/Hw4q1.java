//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw4q1 {
    public static void main(String[] args) {
        System.out.print("Enter 10 integers: ");
        Scanner stdin = new Scanner(System.in);
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = stdin.nextInt();
        }
        list = eliminateDuplicate(list);
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int[] eliminateDuplicate(int[] list) {
        int templist[] = new int[10];
        templist[0]=list[0];
        int index = 0;
        for(int i = 1; i<10; i++){
            for(int n = 0;n<i;n++){
                if(list[i]==list[n]){
                    n=i;
                }else if(list[i]!=list[n] && n==i-1){
                    index++;
                    templist[index]=list[i];
                }
            }
        }
        int newlist[] = new int[index+1];
        for(int i = 0;i<=index;i++){
                newlist[i]=templist[i];
        }
        return newlist;
    }
}