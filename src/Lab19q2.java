import java.util.Scanner;
class QuadraticEquation{
    private double a=1,b=1,c=1;
    public double getA(double a){
        this.a=a;
        return a;
    }
    public double getB(double b){
        this.b=b;
        return b;
    }
    public double getC(double c){
        this.c=c;
        return c;
    }
    public String getDiscriminant(){
        String dis;
        double Dis = (b*b)-(4*a*c);
        if (Dis==0){
            dis = "The equation has one root: "+(-b)/(2*a);
        }else if(Dis<0){
            dis = "The equation has no real roots";
        }else{
            double root1 = getRoot1(a,b,c,Dis);
            double root2 = getRoot2(a,b,c,Dis);
            dis ="The equation has two roots: "+root1+", "+root2;
        }
        return dis;
    }
    public double getRoot1(double a,double b,double c,double Dis){
        Dis = Math.pow(Dis,.5);
        double root1 = (((-b)+Dis)/(2*a));
        return root1;
    }
    public double getRoot2(double a,double b,double c,double Dis){
        Dis = Math.pow(Dis,.5);
        double root2 = (((-b)-Dis)/(2*a));
        return root2;
    }
}
public class Lab19q2 {
    public static void main(String[] args){
        QuadraticEquation q1 = new QuadraticEquation();
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a,b,c;
        a = stdin.nextDouble();
        b = stdin.nextDouble();
        c = stdin.nextDouble();
        q1.getA(a);
        q1.getB(b);
        q1.getC(c);
        System.out.println(q1.getDiscriminant());
    }
}
