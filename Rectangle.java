package tamil;

import java.math.*;
import java.util.*;

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

	


