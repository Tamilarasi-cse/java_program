5import java.util.Scanner;
class Maths
{
public static void main(String args[])
{
int a=(4*(4+8))/4;
System.out.println("the answer="+a);
}
}
import java.util.Scanner;
class distance
{
public static void main(String args[])
{
Scanner distance = new Scanner(System.in);
System.out.println("Enter the value for initial velocity ");
int u = distance.nextInt();
System.out.println("Enter the value for acceleration ");
int a = distance.nextInt();
System.out.println("Enter the value for time taken");
int t = distance.nextInt();
int d = u*t+(a*t^2)/2;
System.out.println("the distance travelled by a vehile "+d);
}
}
import java.util.Scanner;
class cyli
{
    int radius;
    int height;
    int volume = 3.14*radius*height;
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
    System.out.println("the volume of cylinder is "+volume);
}
}
