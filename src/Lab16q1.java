import java.util.Scanner;
public class Lab16q1{
    public static void main(String[] args){
        System.out.println("Enter the amount of students:");
        Scanner stdin = new Scanner(System.in);
        int amount = stdin.nextInt();
        int grades[] = new int[amount];
        System.out.println("Enter your student's grades: ");
        for (int i = 0; i < amount; i++){
            grades[i] = stdin.nextInt();
        }grader(grades,amount);
    }public static int max(int grades[], int amount){
        int max=grades[0];
        for(int i = 1;i<amount;i++){
            if(max<grades[i]){
                int p = grades[i];
                max = p;
            }
        }return max;
    }public static void grader(int grades[],int amount){
        int max = max(grades,amount);
        for(int i = 0;i<amount;i++){
            if(grades[i]>=max-10){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is A");
            }else if(grades[i]>=max-20){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is B");
            }else if(grades[i]>=max-30){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is C");
            }else if(grades[i]>=max-40){
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is D");
            }else{
                System.out.println("Student "+i+" score is "+grades[i]+" and grade is F");
            }
        }
    }
}
