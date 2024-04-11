import java.util.Scanner;
import java.util.*;
interface Shape
{
 void printArea();
}
class Rectangle implements Shape
{
Rectangle(int length,int breath);
void printArea()
{
int area = length*breath;
}
}
class Triangle implements Shape
{
Triangle(int length,int breath);
void printArea()
{
double area = 0.5*length*breath;
}
}
class Circle implements Shape
{
Circle(int radius);
void printArea()
{
double area = 3.14*radius*radius;
}
}
class Shapes {
public static void main (String args[])
{
Scanner ha =new Scanner();
Rectangle r =new Rectangle();
r.Rectangle(20,5);
System.out.println("The Area of Rectangle is "+r.Rectangle());
Triangle t = new Triangle();
t.Triangle(12,10);
System.out.println("The Area of Triangle is "+t.Triangle());
Circle c = new Circle();
c.Circle(15);
System.out.println("The Area of Circle is "+c.Circle());
}
}