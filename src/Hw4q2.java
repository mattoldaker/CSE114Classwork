//Matthew Oldaker 112822208
import java.util.Scanner;
public class Hw4q2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter list 1 size and contents: ");
        int size1 = stdin.nextInt();
        int list1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = stdin.nextInt();
        }
        System.out.print("Enter list 2 size and contents: ");
        int size2 = stdin.nextInt();
        int list2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = stdin.nextInt();
        }
        int list3[] = merge(list1, list2);
        System.out.print("The merged list is: ");
        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i] + " ");
        }
    }
    public static int[] merge(int[] list1, int[] list2) {
        int size1 = list1.length;
        int size2 = list2.length;
        int size3 = size1 + size2;
        int list3[] = new int[size3];
        for (int i = 0; i < size1; i++) {
            list3[i] = list1[i];
        }
        for (int i = size1; i < size3; i++) {
            list3[i] = list2[i - size1];
        }
        int temp;
        for(int i = 0; i < size3; i++) {
            for(int j = 0; j < size3 - 1; j++) {
                if(list3[j] > list3[j + 1]) {
                    temp = list3[j];
                    list3[j] = list3[j + 1];
                    list3[j + 1] = temp;
                }
            }
        }
        return list3;
    }
}
