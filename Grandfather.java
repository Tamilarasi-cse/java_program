import java.util.Scanner;
class grandfather
{
   void grandfather ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Grandfather :");
         String name = sc.nextLine();
        System.out.println("Enter the age of Grandfather :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of Grandfather :");
        int salary = sc.nextInt();
    }
    
    void daughter ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Daughter :");
         String name = sc.nextLine();
        System.out.println("Enter the age of Daughter :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of Daughter :");
        int salary = sc.nextInt();
    }
    void son ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Son :");
        String name = sc.nextLine();
        System.out.println("Enter the age of  Son :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of  Son :");
        int salary = sc.nextInt();
    }
}
class daughter extends grandfather
{
    void son_in_law()
    {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the name of Son_in_law :");
        String name = sc.nextLine();
        System.out.println("Enter the age of  Son_in_law :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of  Son_in_law :");
        int salary = sc.nextInt();
        
    }
    void grandson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Grandson :");
        String name = sc.nextLine();
        System.out.println("Enter the age of Grandson :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of  Grandson :");
        int salary = sc.nextInt();
    }
}
class son extends daughter
{
    void daughter_in_law()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Daughter_in_law :");
        String name = sc.nextLine();
        System.out.println("Enter the age of  Daughter_in_law :");
        int age = sc.nextInt();
        System.out.println("Enter the salary of  Daughter_in_law :");
        int salary = sc.nextInt();
    }
    void grandson2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Grandson2 :");
        String name = sc.nextLine();
        System.out.println("Enter the age of  Grandson2 :");
        int age = sc.nextInt();
        System.out.println("Enter the fees of  Grandson2 :");
        int salary = sc.nextInt();
    }
    void granddaughter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Granddaughter :");
        String name = sc.nextLine();
        System.out.println("Enter the age of  Granddaughter :");
        int age = sc.nextInt();
        System.out.println("Enter the fees of  Granddaughter :");
        int salary = sc.nextInt();
    }
}
class family
{
    public static void main (String args[])
    {
        
        son p=new son();
        p.grandfather();
        p.daughter();
        p.son();
        p.son_in_law();
        p.grandson();
        p.daughter_in_law();
        p.grandson2();
        p.granddaughter();
      
}
}