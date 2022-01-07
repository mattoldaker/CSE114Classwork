public class Lab11q1 {
    public static void main(String[] args){
        double f = 0;
        for (double num = 1;num<=97;num+=2){
            double den = num + 2;
            f = f + (num/den);
        } System.out.println(f);
    }
}
