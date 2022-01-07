//Matthew Oldaker 112822208
public class Problem2 {
    public static void main(String[] args) {
        Shape[] list = new Shape[9];
        list[0]= new Circle(2);
        list[1] = new Square(2);
        list[2] = new Triangle(2,5);
        list[3] = new Sphere(4);
        list[4] = new Cube(2.7);
        list[5] = new Tetrahedron(4);
        list[6] = new TwoDimensionalShape();
        list[7] = new ThreeDimensionalShape();
        list[8] = new Shape();
        for(int i = 0;i<list.length;i++){
            if(list[i].isshape()){
                if(list[i].is3D()==false){
                    System.out.print("Shape "+(i+1)+" is two dimensional " +list[i].type()+"\nIts Area is: ");
                    list[i].GetArea();
                }else if(list[i].is3D()){
                    System.out.print("Shape "+(i+1)+" is three dimensional " +list[i].type()+"\nIts Area is: ");
                    list[i].GetArea();
                    System.out.print("Its Volume is: ");
                    list[i].GetVolume();
                }
            }
            else if(list[i].isdim()){
                System.out.println("Shape "+(i+1)+" is a "+list[i].type());
            }else{
                System.out.println("Shape "+(i+1)+" is a Shape");
            }
            System.out.println(" ");
        }
    }
}
class Shape{
    public void GetArea(){
    }
    public void GetVolume(){
    }
    public boolean is3D() {
        return false;
    }
    public String type(){
        return null;
    }
    public boolean isshape(){
        return false;
    }
    public boolean isdim(){
        return false;
    }
}
class TwoDimensionalShape extends Shape{
    public void GetArea(){
    }
    public boolean is3D() {
        return false;
    }
    public String type() {
        return "Two Dimensional Shape";
    }
    public boolean isshape(){
        return false;
    }
    public boolean isdim(){
        return true;
    }
}
class ThreeDimensionalShape extends Shape{
    public void GetArea(){
    }
    public void GetVolume(){
    }
    public boolean is3D() {
        return true;
    }
    public String type() {
        return "Three Dimensional Shape";
    }
    public boolean isshape(){
        return false;
    }
    public boolean isdim(){
        return true;
    }
}
class Circle extends TwoDimensionalShape{
    private double Radius;
    public Circle(double Radius){
        this.Radius=Radius;
    }
    public void GetArea(){
        double Area = Radius*Radius*Math.PI;
        System.out.println(Area);
    }
    public String type() {
        return "Circle";
    }
    public boolean isshape(){
        return true;
    }
}
class Square extends TwoDimensionalShape{
    private double Sidelength;
    public Square(double SideLength){
        this.Sidelength=SideLength;
    }
    public void GetArea(){
        double Area = Sidelength*Sidelength*Math.PI;
        System.out.println(Area);
    }
    public String type() {
        return "Square";
    }
    public boolean isshape(){
        return true;
    }
}
class Triangle extends TwoDimensionalShape{
    private double Height,Base;
    public Triangle(double Height,double Base){
        this.Height=Height;
        this.Base=Base;
    }
    public void GetArea(){
        double Area = Height*Base*0.5;
        System.out.println(Area);
    }
    public String type() {
        return "Triangle";
    }
    public boolean isshape(){
        return true;
    }
}
class Sphere extends ThreeDimensionalShape{
    private double radius;
    public Sphere(double radius){
        this.radius=radius;
    }
    public void GetArea(){
        System.out.println(radius*radius*Math.PI*4);
    }
    public void GetVolume(){
        System.out.println((4*Math.pow(radius,3)*Math.PI)/3);
    }
    public String type() {
        return "Sphere";
    }
    public boolean isshape(){
        return true;
    }
}
class Cube extends ThreeDimensionalShape{
    private double edge;
    public Cube(double edge){
        this.edge=edge;
    }
    public void GetArea(){
        System.out.println(6*edge*edge);
    }
    public void GetVolume(){
        System.out.println(Math.pow(edge,3));
    }
    public String type() {
        return "Cube";
    }
    public boolean isshape(){
        return true;
    }
}
class Tetrahedron extends ThreeDimensionalShape{
    private double edge;
    public Tetrahedron(double edge){this.edge=edge;}
    public void GetArea(){
        System.out.println(edge*edge*Math.pow(3,.5));
    }
    public void GetVolume(){
        System.out.println(Math.pow(edge,3)/(6*Math.pow(2,.5)));
    }
    public String type() {
        return "Tetrahedron";
    }
    public boolean isshape(){
        return true;
    }
}