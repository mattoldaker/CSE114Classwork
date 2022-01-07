import java.util.ArrayList;
public class Lab24q2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(95);
        list.add(85);
        list.add(65);
        list.add(100);
        list.add(90);
        list.add(75);
        ArrayList<Character> clist;
        clist = grade(list);
        for(int i = 0; i<clist.size();i++){
            System.out.print(clist.get(i)+" ");
        }
    }
    public static ArrayList<Character> grade(ArrayList<Integer> list){
        ArrayList<Character> clist = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(list.get(i)>=90){
                clist.add('A');
            }else if(list.get(i)>=80){
                clist.add('B');
            }else if(list.get(i)>=70){
                clist.add('C');
            }else if(list.get(i)>=60){
                clist.add('D');
            }else{
                clist.add('F');
            }
        }
        return clist;
    }
}
