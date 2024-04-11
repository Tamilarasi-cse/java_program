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
    System.out.println("Enter the value of radius : ");
    vol.radius=cylinder.nextInt();
    System.out.println("Enter the value of height : ");
    vol.height=cylinder.nextInt();
    System.out.println("the volume of cylinder is "+volume);
}
}
