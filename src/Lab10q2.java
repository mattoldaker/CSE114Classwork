import java.util.Scanner;
public class Lab10q2 {
    public static void main(String[] args) {
        System.out.print("Enter a SSN in DDD-DD-DDDD form (D for digit): ");
        Scanner stdin = new Scanner(System.in);
        String n = stdin.next();
        String f = n.replace("1", "0").replace("2", "0").replace("3", "0").replace("4", "0").replace("5", "0").replace("6", "0").replace("7", "0").replace("8", "0").replace("9", "0");
        if(f.compareTo("000-00-0000")==0){
            System.out.print(n+" Is a valid social security number");
        }else{
            System.out.print(n+" Is NOT a valid social security number");
        }
    }
}

