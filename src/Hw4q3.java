//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw4q3 {
    public static void main(String[] args) {
        System.out.println("Enter 10 strings: ");
        Scanner stdin = new Scanner(System.in);
        String list[] = new String[10];
        for (int i = 0; i < 10; i++) {
            list[i] = "";
            list[i] = stdin.nextLine();
        }
        list=sort(list);
        System.out.print("The merged list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    public static String[] sort(String list[]) {
        String temp;
        String listl[] = new String[10];
        for(int i = 0; i<10;i++){
            listl[i] = list[i].toLowerCase();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - 1; j++) {
                if (listl[j].compareTo(listl[j + 1]) > 0) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    temp = listl[j];
                    listl[j] = listl[j + 1];
                    listl[j + 1] = temp;
                }
            }
        }
        return list;
    }
}
