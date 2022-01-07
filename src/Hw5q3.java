//Matthew Oldaker 112822208
class Circle2D {
    private double rad;
    private double x;
    private double y;
    public Circle2D() {
        this.rad=1.0;
        this.x=0;
        this.y=0;
    }
    public Circle2D(double x, double y, double rad){
        this.x=x;
        this.y=y;
        this.rad=rad;
    }
    public double getRad() {return this.rad;}
    public double getx(double x) {return this.x;}
    public double gety(double y) {return this.y;}
    public void setRad(double rad){this.rad=rad;}
    public void setx(double x){this.x=x;}
    public void sety(double y){this.y=y;}
    public double getArea() {
        return rad * rad * Math.PI;
    }
    public double getPerimeter() {return (2 * Math.PI * rad);}
    public boolean contains(double xp, double yp) {
        if ((Math.pow((Math.pow(xp - x, 2) + Math.pow(yp - y, 2)), .5)) >= rad) {
            return false;
        } else {
            return true;
        }
    }
    public boolean contains(Circle2D circle) {
        if (contains(circle.x, circle.y) == false) {
            return false;
        } else if ((Math.pow((Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2)), .5)) + circle.rad < rad) {
            return true;
        } else {
            return false;
        }
    }
    public boolean overlaps(Circle2D circle) {
        if (contains(circle)) {
            return false;
        } else if ((Math.pow((Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2)), .5)) <= circle.rad + rad) {
            return true;
        } else {
            return false;
        }
    }
}
public class Hw5q3 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("The Area is: "+c1.getArea());
        System.out.println("The Perimeter is: "+c1.getPerimeter());
        System.out.println("c1 contains point: "+c1.contains(3, 3));
        System.out.println("c1 contains c2: "+c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 overlaps c2: "+c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
