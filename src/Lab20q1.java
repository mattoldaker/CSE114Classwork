class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x=0;
        this.y=0;
    }

    RegularPolygon(int n, double side, double y, double x){
        this.n=n;
        this.x=x;
        this.y=y;
        this.side=side;
    }
    RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x = 0;
        this.y = 0;
    }
    public double getArea(){
        double Area=((n*side*side)/(4*(Math.tan((Math.PI)/(n)))));
        return Area;
    }
    public double getPerimeter(){
        double Perimeter=(n*side);
        return Perimeter;
    }

    public int getN(){
        return this.n;
    }
    public double getSide(){
        return this.side;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setN(int n){
        this.n = n;
    }
    public void setSide(int side){
        this.side=side;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
public class Lab20q1 {
    public static void main(String[] args){
        RegularPolygon r1 = new RegularPolygon();
        RegularPolygon r2 = new RegularPolygon(6,4);
        RegularPolygon r3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("The first objects area is "+r1.getArea()+" and perimeter is "+ r1.getPerimeter());
        System.out.println("The second objects area is "+r2.getArea()+" and perimeter is "+ r2.getPerimeter());
        System.out.println("The third objects area is "+r3.getArea()+" and perimeter is "+ r3.getPerimeter());
    }
}
