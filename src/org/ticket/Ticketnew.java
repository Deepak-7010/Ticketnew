package org.ticket;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ticketnew {
	public static void main(String[] args) throws ParseException {
		
		int user = 1;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Screen>arr = new ArrayList<>();
		ArrayList<Viewers>arrview = new ArrayList<>();
		arr.add(new Screen(6, 2));
		arr.add(new Screen(10, 0));
		
		for (Screen se : arr) {
			se.screeninfo();
			
		}
		
		
		while (user==1) {
			System.out.println("Press 1 for booking ,Press 2 for exit");
			user=sc.nextInt();
			if (user==1) {
				Viewers booking = new Viewers();
				if (booking.isAvaliable(arr,arrview)) {
					arrview.add(booking);
					System.out.println("Ticket confrimly booked");
					
				}
				else {
					System.out.println("Tickets are not avaliable");
				}
				
			}
			
		}
		
		
		
	}

}
