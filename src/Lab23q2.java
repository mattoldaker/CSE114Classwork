import java.util.ArrayList;
import java.util.Scanner;
public class Lab23q2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        ArrayList<String> lst1 = new ArrayList<String>();
        ArrayList<String> lst2 = new ArrayList<String>();
        lst1.add("Austin");
        lst1.add("Dallas");
        lst1.add("San Francisco");
        lst2.add("Boston");
        lst2.add("Chicago");
        lst2.add("Denver");
        lst2.add("Seattle");
        ArrayList<String> lst3 = new ArrayList<String>();
        lst3 = mergeList(lst1,lst2);
        for(int i = 0; i<lst3.size();i++){
            System.out.print("\""+lst3.get(i)+"\" ");
        }
    }
    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2){
        ArrayList<String> lst3 = new ArrayList<String>();
        for(int i = 0; i<lst1.size();i++){
            lst3.add(lst1.get(i));
        }
        for(int i = 0;i<lst2.size();i++){
            lst3.add(lst2.get(i));
        }
        String temp;
        for(int i = 0;i<lst3.size();i++){
            for(int n = 0;n<(lst3.size()-1);n++) {
                if ((lst3.get(n)).compareTo(lst3.get(n + 1)) > 0) {
                    temp = lst3.get(n);
                    lst3.set(n, lst3.get(n + 1));
                    lst3.set(n + 1, temp);
                }
            }
        }
        return lst3;
    }
}