import java.math.*;
import java.util.*;
public interface Shape1
{
    void printArea();
}
public class Rectangle implements Shape1
{
    int x,y;
    Rectangle(int a,int b)
    {
        this.x=a;
        this.y=b;
      }
    public void printArea()
      {
         int area =this.x*this.y;
         System.out.println("The Area of Rectangle = "+area);
       }
}
public class Triangle extends Shape
{
int x,y;
 Triangle(int base, int height)
      {
         this.x=a;
        this.y=b;
       }
    void printArea()
     {
         double area = 0.5*this.x*this.y;
         System.out.println(“The Area of Triangle = “+area);
     }
}
public class Circle extends Shape
{
int x,y;
Circle(int radius)
   {
      this.x=radius;
      this.y=radius;
      }
    void printArea()
     {
         double area = Math.PI*this.x*this.y;
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
