package mini;
import java.util.Scanner;
import java.util.ArrayList;
public class bus_demo {
 public static void main(String agrs[])
 {
	 ArrayList<bus> buses = new ArrayList<bus>();
	 ArrayList<booking> bookings = new ArrayList<booking>();
	 
	 buses.add(new bus(1,true,3));
	 buses.add(new bus(2,true,4));
	 buses.add(new bus(3,false,2));
	 
	 int useropt=1;
	 Scanner scanner= new Scanner(System.in); 
	 for(bus b:buses)
	 {
		 b.dispalybusinfo();
	 }
	 while(useropt==1)
	 {
		 System.out.println("Enter 1 to BOOK 2 to EXIT :");
		 useropt= scanner.nextInt();
		 if(useropt==1)
		 {
			booking Booking = new booking();
			if(Booking.isAvailable(bookings,buses))
			{
				bookings.add(Booking);
				System.out.println("Your booking is confirmed ");
			}
			else
			{
				System.out.println("Sorry ,BUS IS FULL!!. TRY ANOTHER BUS OR DATE ");
			}
			
		 }
	 }
	 
 }
}
