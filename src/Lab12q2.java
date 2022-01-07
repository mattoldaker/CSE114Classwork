import java.util.ArrayList;
import java.util.Scanner;
public class Lab12q2 {
    public static void main(String[] args){
        System.out.println("Enter your i value:");
        Scanner stdin = new Scanner(System.in);
        int i = stdin.nextInt();
        double ni=0;
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int no = 0;
        for(double n = 1; n<=i ; n++){
            ni=ni+(n/(n+1));
            numbers.add(ni);
            no++;
            ints.add(no);
        }
        System.out.println("i       m(i)");
        System.out.println(ints.get(0)+"       "+numbers.get(0));
        System.out.println(ints.get(1)+"       "+numbers.get(1));
        System.out.println("...     ");
        System.out.println(ints.get(i-2)+"      "+numbers.get(i-2));
        System.out.println(ints.get(i-1)+"      "+numbers.get(i-1));
    }
}
