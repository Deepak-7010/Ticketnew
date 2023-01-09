package org.ticket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Viewers {
	String name;
	int screenno;
	Date date;
	
	public Viewers() throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your screenno");
		screenno=sc.nextInt();
		System.out.println("Enter the dd-mm-yyy");
		
		String dateinput = sc.next();
		SimpleDateFormat dates = new SimpleDateFormat("dd-MM-yyy");
		date=dates.parse(dateinput);
	}
	
	
	public boolean isAvaliable(ArrayList<Screen>arr,ArrayList<Viewers>arrview) {
		int seat = 0;
		for (Screen se : arr) {
			if (se.getScreenno()==screenno) {
				seat=se.getSeat();
				
			}
			
		}
		
		int booked=0;
		
		for (Viewers w : arrview) {
			if (w.screenno==screenno&&w.date.equals(date)) {
				booked++;
				
			}
			
		}
		
		return booked<seat?true:false;
		

	}
	

}
