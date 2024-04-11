import java.util.Scanner;
public class StackGen<T> {

    class Node<T>{
        T data;
        Node<T> next;
        
        Node(T data){
            this.data= data;
            this.next = null;
        }
    
    }
    
    Node<T> top;    
    StackGen(){
        this.top =null;
    }
    
    boolean isEmpty() {
        return this.top==null;
    }
    
    boolean push(T data) {
        Node<T> newnode = new Node<T>(data);
        newnode.next = this.top;
        this.top = newnode;
        return this.top.next!=null;
    }
    
    T pop() {
        T data = this.top.data;
        this.top=this.top.next;
        return data;
    }
    
    T peek() {
        return this.top.data;
    }
}
 class StackGenTest {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size of integer stack:");
        
        int isize = in.nextInt();
        
        StackGen<Integer> stk = new StackGen<Integer>() ;
        
        System.out.println("\nEnter data:");
        
        for(int i=0;i<isize;i++) {
            stk.push(in.nextInt());
        }
        
        System.out.println("\n");
        int sum=0;
        
        while(!stk.isEmpty()) {
            System.out.println(stk.peek());
            sum+=stk.pop();
            System.out.println("--");
            
        }
        
        System.out.println("The sum of the elements: "+sum);
    }
}
