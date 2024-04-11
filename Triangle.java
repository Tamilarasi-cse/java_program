package tamil;

public class Triangle implements Shape1
{
int x,y;   
 Triangle(int base, int height) 
      {
         this.x=base;
        this.y=height;
       }
    public void printArea() 
     {
         double area = 0.5*this.x*this.y;
         System.out.println("The Area of Triangle = "+area);
     }
}

