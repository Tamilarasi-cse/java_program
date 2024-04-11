package mini;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking 
{
   String passenger_name;
   int busno;
   Date date;
    booking()
    {
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the name of passenger:");
        passenger_name = s.next();
        System.out.println("Enter bus no :");
        busno = s.nextInt();
        System.out.println("Enter date dd-mm-yyyy :");
        String dateInput = s.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    public boolean isAvailable(ArrayList<booking> bookings,ArrayList<bus> buses)
    {
    	int capacity = 0;
    	for(bus bus:buses)
    	{
    		if(bus.getbusNo() == busno)
    			capacity = bus.getcapacity();
    	}
    	int booked=0;
    	for(booking b:bookings)
    	{
    		if(b.busno == busno && b.date.equals(date))
    		{
    			booked++;
    		}
    	}
    	return booked<capacity?true:false;
    }
}
