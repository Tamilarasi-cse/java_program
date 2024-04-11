import java.util.*;
class employee
{
   int id;
   String name;
   float salary;
   employee()
   {
       System.out.println(id+" "+name+" "+salary);
   }
}
class organisation
{
  public static void main(String args[])
{
  employee person=new employee();
  int n,i;
  System.out.println("Enter the no of employees : ");
  Scanner man= new Scanner(System.in);
  n=man.nextInt();
  for(i=0;i<n;i++)
{
  System.out.println("Enter the employee id :");
  person.id= man.nextInt();
  System.out.println("Enter the employee name :");
  person.name = man.next();
  System.out.println("Enter the employee salary :");
  person.salary= man.nextFloat();
}
}
}