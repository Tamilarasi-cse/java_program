
import java.util.*;
class student
{

 int id;
 String name;
 int age;
student(int i,String n)
{
  id = i;
  name =n;
}
student(int i,String n,int a)
{
 id=i;
 name=n;
 age =a;
}
void display()
{
 System.out.println(id+" "+name+" "+age);
}
public static void main(String agrs[])
{
  Scanner happy=new Scanner(System.in);
  student sa = new student(happy.nextInt(),happy.next(),happy.nextInt());
  sa.display();
}
}