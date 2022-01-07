public class Lab9q1 {
    public static void main(String[] args) {
        int r;
        double rd;
        double d=0;
        for (int a=0;a<=9;a++){
           r= (int) (Math.random()*100) ;
           rd=r;
           d+=rd;
        }d=d/10;
        System.out.print(d);
    }
}
