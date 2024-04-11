import java.util.Scanner;
class cyli
{
    int radius;
    int height;
};
class maths
{
public static void main(String args[])
{
    cyli vol =new cyli();
    Scanner cylinder = new Scanner(System.in);
    System.out.println("Enter the value of radius ");
    vol.radius=cylinder.nextInt();
    System.out.println("Enter the value of height ");
    vol.height=cylinder.nextInt();
    double volume = 3.14*vol.radius*vol.height;
    System.out.println("the volume of cylinder is "+ volume );
}
}
/*3import java.util.Scanner;
class temp
{
    float celsius;
};
class fara
{
public static void main(String args[])
{
    temp cel =new temp();
    Scanner fahrenheit = new Scanner(System.in);
    System.out.println("Enter the value of celsius ");
    cel.celsius=fahrenheit.nextInt();
    float temperature = cel.celsius*9/5+32;
    System.out.println("the volume of cylinder is "+ temperature );
}
}*/
4import java.util.Scanner;
class bitwise
{
public static void main(String args[])
{
  int a=5,b=9;
  System.out.println("a&b "+(a&b));
  System.out.println("a|b "+(a|b));
  System.out.println("a^b "+(a^b));
  System.out.println("a~b "+(a&b));
}
}
6 import java.util.Scanner;
class pattern
{
public static void main(String args[])
{
int i, j , n=11;
for(i=1; i<n; i++)
{
for(j=1; j<=i; j++)
{
System.out.println(" "+j);
}
System.out.println();
}
}
}
