import java.util.Scanner;
public class Lab12q1 {
    public static void main(String[] args){
        System.out.println("Enter your string");
        Scanner stdin = new Scanner(System.in);
        String str = "";
        str += stdin.nextLine();
        System.out.println("Enter your character");
        char a = stdin.next().charAt(0);
        count(str,a);
    }
    public static void count(String str, char a){
        int L = str.length()-1;
        int amt=0;
        for (int i=0;i<=L;i++){
            char comp = str.charAt(i);
            if (comp == a) {
                amt++;
            }else{}
        }System.out.print("Your String \""+str+"\" has "+amt+" Occurrences of character \"" +a+"\"");
    }
}
