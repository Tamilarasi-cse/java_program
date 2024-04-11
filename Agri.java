 import java.util.Scanner;
class Agri
{
public static void main(String args[])
{
int i;
for(i=0;i<10;i++)
{
Scanner water=new Scanner (System.in);
System.out.println("enter the values");
float n = water.nextFloat();
if(n>= 25)
{
if(n==24)
{
System.out.println("water is sufficient");
}
else
{
System.out.println("water supply is needed");
}
}
}
}
}
