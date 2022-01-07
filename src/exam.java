import java.util.Scanner;

public class exam{

    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter the number of values: ");

        int size = stdin.nextInt();

        int[] list = new int[size];

        if(isConsecutiveFour(list)==true){

            System.out.println("The list has consecutive fours");

        }else{

            System.out.println("The list has no consecutive fours");

        }

    }

    public static boolean isConsecutiveFour(int[] values){

        for(int i = 0; i<values.length-4;i++){

            if(values[i]==values[i+1]&&values[i+1]==values[i+2]&&values[i+2]==values[i+3]){

                return true;

            }

        }return false;

    }

}