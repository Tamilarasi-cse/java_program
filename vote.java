import java.io.IOException;
import java.util.*;
 class vote 
{
    public static void main(String args[]) 
     {
        int a=0,b=0,c=0,d=0;
        try    
          {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Age:");
            int age = in.nextInt();
            if(age<18)
{
            throw new ArithmeticException("Age is Under 18: Not Valid for Voting");
             } 
            else {
                System.out.println("Valid for Voting...");
                System.out.println("Enter your vote:\na\nb\nc\nd");
                String choice = in.next();
                switch(choice.toLowerCase())
    {
                case "a":
                    a++;
                    break;
                case "b":
                    b++;
                    break;
                case "c":
                    c++;
                    break;
                case "d":
                    d++;
                    break;
                default:
                    throw new IOException("Invalid Choice");
                   }      
                System.out.println("The vote count:");
                System.out.println("a: "+a);
                System.out.println("b: "+b);
                System.out.println("c: "+c);
                System.out.println("d: "+d);
             }
        }
        catch(ArithmeticException e)
         {
            System.out.println(e.getMessage());
         }
        catch(IOException e) 
         {
            System.out.println(e.getMessage());
            main(null);
         } 
    }
}
