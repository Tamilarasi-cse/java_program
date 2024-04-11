 import java.util.Scanner;
 class Solution 
 {
     public static void main(String args[])
     {
   Scanner happy=new Scanner(System.in);
   int n = happy.nextInt();
   if(n%2==0)
   {
       if(n>=2&&n<=5)
       {
           System.out.println("Not Weird");
       }
   }
    if(n%2==0)
   {
       if(n>=6&&n<=20)
       {
           System.out.println("Weird");
       }
   }
    if(n%2==0)
   {
       if(n>20)
       {
           System.out.println("Not Weird");
       }
   }
   if(n%2!=0)
   {
       System.out.println("weird");
   }  
 }
 }