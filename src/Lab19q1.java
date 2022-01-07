class Rectangle{
    private double height = 1;
    private double width = 1;
    public Rectangle() {
    }
    public double getArea(){
        return height*width;
    }

    public double getHeight(double height){
        this.height = height;
        return height;
    }
    public double getWidth(double Width) {
        this.width = Width;
        return Width;
    }
    public double getPerimeter(){
        return 2*height+2*width;
    }
}
public class Lab19q1 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.getArea();
        r1.getPerimeter();
        System.out.println("Rectangle 1: ");
        System.out.println("Width: "+r1.getWidth(40));
        System.out.println("Height: "+ r1.getHeight(4));
        System.out.println("Area: "+r1.getArea());
        System.out.println("Perimeter: "+r1.getPerimeter()+"\n");
        System.out.println("Rectangle 2: ");
        System.out.println("Width: "+r2.getWidth(35.9));
        System.out.println("Height: "+ r2.getHeight(3.5));
        System.out.println("Area: "+r2.getArea());
        System.out.println("Perimeter: "+r2.getPerimeter());
    }
}
