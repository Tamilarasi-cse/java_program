import java.util.*;
public class Exp1A 
{
    public int sequentialsearch(int arr[],int s)
   {
        for(int i=0;i<arr.length;i++) 
{
            if(arr[i]==s) 
	  {
             	   return i;
            	  }
        	}
        return -1;
    }    
    
    public void printArray(int arr[]) 
     {
        for(int i=0;i<arr.length;i++) 
	{
            System.out.print(arr[i]+" ");
             }        
      }
    public static void main(String args[]) 	
     {
            int size;
            Scanner in = new Scanner(System.in);
            Exp1A ob = new Exp1A();
            System.out.println("Enter size: ");
            size = in.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter Data: ");
            for(int i=0;i<size;i++)
 {
                arr[i] = in.nextInt();
     	  }
  System.out.println("\nEnter element to be searched: ");
            int s = in.nextInt();
            int idx=ob.sequentialsearch(arr,s);
            System.out.println("The element you are looking for "+(idx>0?("is at index "+idx):("is not in the array")));
            in.close();
        }
  }
