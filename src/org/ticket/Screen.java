package org.ticket;

public class Screen {
	private int screenno;
	private int seat;
	
	
	public Screen(int sn,int place) {
		this.screenno=sn;
		this.seat=place;
	
	}


	public int getScreenno() {
		return screenno;
	}


	public void setScreenno(int sn) {
		screenno = sn;
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int place) {
		seat = place;
	}
	
	public void screeninfo() {
		System.out.println("Screenno:"+screenno+' '+"Seat:"+seat);
		

	}
	
	
	

}
