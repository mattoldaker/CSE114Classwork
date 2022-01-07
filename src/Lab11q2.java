import java.util.Scanner;
public class Lab11q2 {
    public static void main(String[] args){
        System.out.println("Enter your date in MM/DD/YYYY format: ");
        Scanner stdin = new Scanner(System.in);
        String date = stdin.next();
        String year = date.substring(6,10);
        String day = date.substring(3,5);
        String month = date.substring(0,2);
        int months = Integer.parseInt(month);
        int days = Integer.parseInt(day);
        switch (months){
            case 1:
                System.out.print("January ");
                break;
            case 2:
                System.out.print("February ");
                break;
            case 3:
                System.out.print("March ");
                break;
            case 4:
                System.out.print("April ");
                break;
            case 5:
                System.out.print("May ");
                break;
            case 6:
                System.out.print("June ");
                break;
            case 7:
                System.out.print("July ");
                break;
            case 8:
                System.out.print("August ");
                break;
            case 9:
                System.out.print("September ");
                break;
            case 10:
                System.out.print("October ");
                break;
            case 11:
                System.out.print("November ");
                break;
            case 12:
                System.out.print("December ");
                break;
        }
        System.out.print(days + ", " + year);
    }
}
