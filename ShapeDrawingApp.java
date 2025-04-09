import java.util.*;

abstract class shape
{
    double l,b,h;
    String color;
    shape(String col){
        this.color=col;
    }
    abstract void calculatearea();
    

}
class Circle extends shape{
    double r;
    
    Circle(double r,String col){
        super(col);
        this.r=r;
    }
    void calculatearea(){
        System.out.println("Color of this shape: "+color);
        System.out.println("Area of a Circle: "+(3.14*r*r));
    }
}

class Rectangle extends shape{
    double length,breadth;
    Rectangle(Double leng, double bread,String col){
        super(col);
        this.length=leng;
        this.breadth=bread;
    }
    void calculatearea(){
        System.out.print("Color of this shape: "+color);
        System.out.println("Area of a Rectangle: "+(length*breadth));
    }
}
class ShapeDrawingApp{
    public static void main(String []a){
        Scanner sc=new Scanner (System.in);
       
        System.out.print("Enter the radius of a shape: ");
        double rad= sc.nextDouble();
        System.out.println("Enter the color of a shape: ");
        String color=sc. next();

         System.out.print("Enter the length of a shape: ");
        double len=sc. nextDouble();
        System.out.print("Enter the breadth of a shape: ");
        double bre= sc.nextDouble();
        System.out.println("Enter the color of a shape: ");
        String color=sc. next();
        
        shape ref;
        Circle c=new Circle(rad,color);
        ref=c;
        ref.calculatearea();
        Rectangle rec=new Rectangle(len,bre,color);
        ref=rec;
        ref.calculatearea();
    }
}