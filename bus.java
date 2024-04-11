package mini;

public class bus 
{
  private int busno;
  private int capacity;
  private boolean ac;
  bus(int no,boolean ac,int cap)
  {
	  this.busno = no;
	  this.ac = ac;
	  this.capacity = cap;
  }
  public int getcapacity()
  {
	  return capacity;
  }
  public int getbusNo()
  {
	  return busno;
  }
  public boolean isac()
  {
	  return ac;
  }
  public void setac(boolean val)
  {
	  ac=val;
  }
  public void setcapacity(int cap)
  {
	  capacity =cap;
  }
  public void dispalybusinfo()
  {
	  System.out.println("Bus No:"+" "+busno+" " +"AC:" +ac+" "+ "Total Capacity:"+capacity );
  }
}
