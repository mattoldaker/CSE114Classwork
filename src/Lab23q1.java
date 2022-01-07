import java.util.ArrayList;
import java.util.Scanner;
public class Lab23q1 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = stdin.nextLine();
        ArrayList<Character> slist = new ArrayList<Character>();
        slist = toCharacterArray(s);
        System.out.print("Elements of the Character array list: ");
        for(int i = 0;i<s.length();i++){
            System.out.print(slist.get(i)+" ");
        }
    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> slist = new ArrayList<Character>();
        for(int i = 0; i<s.length();i++){
            slist.add(s.charAt(i));
        }
        return slist;
    }
}
