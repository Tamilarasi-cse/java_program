import java.util.*;
import java.math.*;
abstract class Shape 
{
    int x,y;
    Shape(int a,int b)
   {
        x=a;
        y=b;
    }
    abstract void printArea();
}
public class Rectangle implements Shape1
{
    Rectangle(int a,int b)
    {
        super(a,b);
     }
    public void printArea() 
    {
         int area =this.x*this.y;
         System.out.println("The Area of Rectangle = "+area);
     }    
}
public class Triangle extends Shape
{
    Triangle(int base, int height)
     {
        super(base, height);
     }
    void printArea()
     {
         double area = 0.5*super.x*super.y;
         System.out.println("The Area of Triangle = "+area);
      }
}
public class Circle extends Shape
{
    Circle(int radius)
     {
        super(radius,radius);
    }

    void printArea() 
     {
         double area = Math.PI*super.x*super.y;
         System.out.println("The Area of Circle = "+area);
     }
}

public class Main
{	
   public static void main(String args[]) 
    {
        int r;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        r = in.nextInt();
        Circle c = new Circle(r);
        c.printArea();

        int a,b;
        System.out.println("Enter Base: ");
        a = in.nextInt();
        System.out.println("Enter Height: ");
        b = in.nextInt();
        Triangle t = new Triangle(a,b);
        t.printArea();

       int ra,rb;
        System.out.println("Enter length: ");
        ra = in.nextInt();
        System.out.println("Enter width: ");
        rb = in.nextInt();
        Rectangle rect = new Rectangle(ra,rb);
        rect.printArea();


    }
}

