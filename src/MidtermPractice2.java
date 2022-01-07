import java.util.Scanner;
public class MidtermPractice2 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter list1");
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int n=0;n<3;n++){
                list1[i][n]=stdin.nextInt();
            }
        }
        System.out.println("Enter list2");
        for(int i = 0;i<3;i++){
            for(int n=0;n<3;n++){
                list2[i][n]=stdin.nextInt();
            }
        }
        if (equals(list1,list2)==true){
            System.out.println("These two arrays are identical");
        }else{
            System.out.println("These two arrays are not identical");
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){
        for(int i = 0;i<3;i++) {
            for (int n = 0; n < 3; n++) {
                if(m1[i][n]!=m2[i][n]){
                    return false;
                }
            }
        }return true;
    }
}
