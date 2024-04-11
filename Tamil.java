import java.util.Scanner;
class Tamil
{
public static void main(String []args)
{
int i,c=0,j;
System.out.println("the value of n is:");
Scanner happy=new Scanner(System.in);
int n = happy.nextInt();
if(n<2){
System.out.println("stop");
}
else
{
System.out.println("enter the values");
for(i=0;i<n;i++)
{
Scanner sad=new Scanner(System.in);
int b = sad.nextInt();
for(j=0;j<n;j++)
{
c++;
}
}
System.out.println("the sum is "+b);
}
}
}