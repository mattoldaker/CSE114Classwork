import java.util.ArrayList;
import java.util.Scanner;

public class Lab24q1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your 5 integers");
        for(int i = 0;i<5;i++){
            list.add(stdin.nextInt());
        }
        sort(list);
        for(int i = 0;i<5;i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void sort(ArrayList<Integer> list){
        int temp;
        for(int i = 0;i<list.size();i++) {
            for (int n = 0; n < (list.size() - 1); n++) {
                if ((list.get(n)).compareTo(list.get(n + 1)) > 0) {
                    temp = list.get(n);
                    list.set(n, list.get(n + 1));
                    list.set(n + 1, temp);
                }
            }
        }
    }
}
