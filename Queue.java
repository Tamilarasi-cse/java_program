import java.util.*;
public class Queue 
 {
    int front,rear;
    static final int max= 1000;
    int[] arr = new int[max];
    
    Queue() 
     {
        front=rear=-1;    
     }
    boolean isEmpty() 
     {
        return front>rear||front<0;
     }
    boolean enqueue(int data)
    {
        rear++;
        if(rear>max) 
{
            System.out.println("Queue is Full");
            return false;
             } 
     else if(isEmpty()) 
            {
            front=0;
            }
    arr[rear]=data;
    return true;
    }
    
    int dequeue() 
    {
        if(!isEmpty())
         {
            return arr[front++];
         }
        System.out.println("Queue is Empty");
        return -1;
    }
    
    int peek() 
    {
        return arr[front];
    }
}
public class Stack 
{
 static final int max = 1000;
 int[] arr = new int[max];
 int top;
 
 Stack() 
  {
      top=-1;
   }
 
 boolean isEmpty() {
     return(top<0);
 }
 
 
 boolean push(int data) 
  {
     top++;
     if(top<max) 
     {
         arr[top] = data;
         return true;
     }
    else 
    {
         System.out.println("Stack Overflow");
         return false;
     }  
 }
 
 int pop() 
{
     int res;
     if(top>=0) 
       {
         res=arr[top];
         top--;
       }
     else 
      {
         System.out.println("Stack Underflow");
         res=-1;
       }
     return res;
}
 
 int peek() 
  {
     return arr[top];
  }
 
 boolean search(int s) 
 {
     int temp = top;
     while(temp>=0) 
       {
         if(arr[temp]== s)
{
             return true;
	}         
         temp--;
       }
     return false;
  }
}
public class Exp2 
  {
    public static void main(String args[]) 
     {
        Scanner in = new Scanner(System.in);
        Stack st = new Stack();
        Queue q = new Queue();
        System.out.println("Enter the size of stack: ");
        int stsize= in.nextInt();
        System.out.println("Enter the data of stack: ");
        for(int i=0;i<stsize;i++) 
         {
            st.push(in.nextInt());
           } 
        System.out.println("stack: ");    
        while(!st.isEmpty())
          {
            System.out.println(st.pop());
           }
        System.out.println("Enter the size of queue: ");
        int qsize= in.nextInt();
        System.out.println("Enter the data of queue: ");
        for(int i=0;i<qsize;i++) 
         {
            q.enqueue(in.nextInt());
         }
        System.out.println("stack: ");    
        while(!q.isEmpty())
        {
            System.out.println(q.dequeue());
        }  
    }
}

