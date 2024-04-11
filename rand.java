public class rand 
{
    public static void main(String args[]) throws InterruptedException 
      {
        thread1 ob = new thread1();
        Thread t1 = new Thread(ob);
    
        t1.start();
      }
}
 class thread1 extends Thread 
{
    int rand;
    thread2 o;
    thread3 b;
    
    thread1()
      {
        this.rand = (int) (Math.random()*100);
        o = new thread2();
        o.setData(rand);
        b = new thread3();
        b.setData(rand);
      }
     void task() 
     {
        Thread t2 = new Thread(o);
        Thread t3 = new Thread(b);
        
        try
         {
            this.rand = (int) (Math.random()*100); 
            System.out.println("from 1: "+rand);
            if(rand%2==0) 
 	  {
                o.setData(rand);
                t2.start();
                }
            else
 {
                b.setData(rand);
                t3.start();
           	 }
       	     Thread.sleep(1000);
          } 
       catch (InterruptedException e) 
       {
            e.printStackTrace();
        }
     }
@Override
 public void run() 
     {
        for(int i=0;i<5;i++) 
{
            this.task();
            System.out.println("");
             }     
     }
}
 class thread2 extends Thread
{
    int a;
    void setData(int a)
     {
        this.a =a;
     }
    @Override
    public void run() 
    {
       System.out.println("from 2: "+Math.pow(a , 2));
     }
}
 class thread3 extends Thread
{
    int a;
    void setData(int a)
      {
        this.a=a;
      }
    @Override
    public void run()
     {
        System.out.println("from 3: "+Math.pow(a, 3));
            
      }
}

