interface animal
{
public void sound();
public void eat();
}
 class Mammal implements animal
{
  public void sound()
  {
    System.out.println("Mammals make sound ");
  }
  public void eat()
  {
    System.out.println("Mammals eat food ");
  }
}
class fat
{
public static void main(String args[])
{
Mammal m=new Mammal();
m.sound();
m.eat();
}
}
  
 
