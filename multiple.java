class multiple
{
public static void main(String args[]){
int d,a;
try 
{
d=0;
a=42/d;
System.out.println("this cannot be exceuted");
}
catch(ArithmeticException e)
{
System.out.println("Divide by 0");
}
System.out.println("a: ");
}

