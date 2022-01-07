import java.util.Scanner;
public class Lab16q2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] input = new int[101];
        int x = stdin.nextInt();
        int c = 0;
        while (x != 0) {
            input[c] = x;
            x = stdin.nextInt();
            c++;
        }
        occurrence(input);
    }

    public static void occurrence(int[] z) {
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 0; j < z.length; j++) {
                if (z[j] == i)
                    count++;
            }
            if (count != 0) {
                if (count == 1) {
                    System.out.println(i + " occurs " + count + " time");
                } else {
                    System.out.println(i + " occurs " + count + " times");
                }
            }
        }
    }
}

