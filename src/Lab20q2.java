import java.util.Scanner;
class LinearEquation {
    private double a, b, c, d, e, f;
    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    public boolean isSolvable() {
        if ((a * d) - (b * c) != 0) {
            return true;
        } else {
            return false;
        }
    }
    public double getX() {
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        return x;
    }
    public double getY() {
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        return y;
    }
    public String getXY(){
        String s;
        if(isSolvable()==true){
            s = "X: "+getX()+"\nY: "+getY();
        }else{
            s = "The equation has no solution.";
        }
        return s;
    }
}
public class Lab20q2 {
    public static void main(String[] args){
        System.out.println("Enter a, b, c, d, e, f: ");
        Scanner stdin = new Scanner(System.in);
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();
        double d = stdin.nextDouble();
        double e = stdin.nextDouble();
        double f = stdin.nextDouble();
        LinearEquation eq = new LinearEquation(a,b,c,d,e,f);
        System.out.println(eq.getXY());
    }
}
