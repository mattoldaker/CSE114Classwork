//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw3q4 {
    public static void main(String[] args){
        System.out.println("Enter two strings: ");
        Scanner stdin = new Scanner(System.in);
        String s1 = stdin.nextLine();
        String s2 = stdin.nextLine();
        if(anagram(s1,s2)==true) {
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are anagrams!");
        }else{
            System.out.println("\""+s1+"\"" + " and " + "\""+s2+"\"" + " are NOT anagrams!");
        }
    } public static boolean anagram(String s1,String s2){
        int i = 0;
        String sl1 = s1.toLowerCase();
        sl1 = sl1.replaceAll("\\s", "");
        String sl2 = s2.toLowerCase();
        sl2 = sl2.replaceAll("\\s", "");
        int length1 = sl1.length();
        int length2 = sl2.length();
        if(length1 != length2) {
            return false;
        }else{
            do{
                char c = sl1.charAt(i);
                int n = 0;
                do{
                    char c2=sl2.charAt(n);
                    if(c2==c){
                        String before = sl2.substring(0,n);
                        String after = sl2.substring(n+1,length2);
                        sl2 = before + after;
                        length2 = sl2.length();
                        n=length2;
                    }else{
                        n++;
                        if(n==length2){
                            return false;
                        }
                    }
                }while(n<length2);
                i++;
            }while(i<length1);
        }
        return true;
    }
}
