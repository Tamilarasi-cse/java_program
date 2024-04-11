package tamil;

public class Circle implements Shape1
{
int x,y;    
Circle(int radius) 
   {
      this.x=radius;
      this.y=radius;
      }
    public void printArea() 
     {
         double area = Math.PI*this.x*this.y;
         System.out.println("The Area of Circle = "+area);
     }
}

