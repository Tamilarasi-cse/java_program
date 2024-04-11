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