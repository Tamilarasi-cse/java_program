import java.util.Scanner;
class Box
{
	float length;
	float breath;

}
 class BoxDemo
{
public static void main(String args[])
{
	Box mybox = new Box();
	int area;
	Scanner happy=new Scanner(System.in);
	mybox.length=happy.nextFloat();
	mybox.breath=happy.nextFloat();
	area = (int)mybox.length*(int)mybox.breath;
	System.out.println("Area of rectangle is "+area);
}
}



