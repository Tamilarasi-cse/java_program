package tamil;
public class rand 
{
 public static void main(String args[]) throws InterruptedException 
 {
 thread1 ob = new thread1();
 Thread t1 = new Thread(ob);
 
 t1.start();
 }
}
