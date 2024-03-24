package busReserve;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	
	private String passengerName;
	private int busNum;
	private Date travelDate;

	Booking() {
		// TODO Auto-generated constructor stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Passenger Name : \n");
		passengerName = scanner.next();
		System.out.println("Enter Bus Number : \n");
		busNum = scanner.nextInt();
		System.out.println("Enter Travel Date in format dd-mm-yyyy : \n");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			travelDate = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNum()== busNum) 
			capacity=bus.getCapacity();
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNum==busNum && b.travelDate.equals(travelDate)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
	}

}
