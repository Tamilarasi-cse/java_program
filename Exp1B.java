import java.util.Scanner;
public class Exp1B 
{
	public int binarysearch(int arr[],int first,int last,int s) 
	{
		int mid = (first+last)/2;
		if(arr[mid]==s) 
		{
			return mid;
		}
		else if(arr[mid]<s) 
		{
	              return binarysearch(arr,mid+1,last,s);
		}
		else if(arr[mid]>s)
		{
		   return binarysearch(arr,first,mid-1,s);
		}
		else 
		{
		   return -1;
		}
	}
	
	public void insertionsort(int arr[])
	{
		int temp;
		for(int i=1;i<arr.length;i++) 
		{
			temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j]) 
			{
  	            	   arr[j+1]=arr[j];
			   j--;
					
			}
			arr[j+1]=temp;
		}
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
		Exp1B ob = new Exp1B();
		System.out.println("Enter size: ");
		size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Data: ");
		for(int i=0;i<size;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("The entered array: ");
		ob.printArray(arr);
		System.out.println("\nThe array after sorting: ");
		ob.insertionsort(arr);
		ob.printArray(arr);
		System.out.println("\nEnter element to be searched: ");
		int s = in.nextInt();
		int idx=ob.binarysearch(arr,0,arr.length-1,s);
		System.out.println("The element you are looking for "+(idx>0?("is at index "+idx):("is not in the array")));
		in.close();
	}
}
