import java.util.Scanner;
public class Lab9q2 {
    public static void main(String[] args){
        System.out.print("Enter three cities: ");
        Scanner stdin = new Scanner(System.in);
        String s1=" ";
        s1=stdin.next();
        s1+=stdin.nextLine();
        String s2=" ";
        s2=stdin.next();
        s2+=stdin.nextLine();
        String s3=" ";
        s3=stdin.next();
        s3+=stdin.nextLine();
        String first,second,third;
        String s1l = s1.toLowerCase();
        String s2l = s2.toLowerCase();
        String s3l = s3.toLowerCase();
        if(s1l.compareTo(s2l)<0 && s1l.compareTo(s3l)<0){
            first = s1;
            if(s2l.compareTo(s3l)<0) {
                second = s2;
                third = s3;
            }else {
                second = s3;
                third = s2;
            }
        }else if (s2l.compareTo(s1l)<0 && s2l.compareTo(s3l)<0){
            first = s2;
            if(s1l.compareTo(s3l)<0) {
                second = s1;
                third = s3;
            }else {
                second = s3;
                third = s1;
            }
        }else{
            first = s3;
            if(s1l.compareTo(s2l)<0) {
                second = s1;
                third = s2;
            }else {
                second = s2;
                third = s1;
            }
        }System.out.print(first+" "+second+" "+third);
    }
}
