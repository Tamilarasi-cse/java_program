import java.util.Scanner;

class add
{
public static void main(String args[])
{
int rem=0,sum=0;
System.out.println("enter the number ");
Scanner n=new Scanner(System.in);
int number=n.nextInt();
while(number>0)
{
   rem=number%10;
   sum=sum*10+rem;
   number=number/10;
}
  System.out.println(" the sum is "+sum);
}
}
