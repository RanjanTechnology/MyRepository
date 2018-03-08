package com.bus.bo;

import java.util.Date;

public class PassengerTicketBO {
	
	private int ticketNo;
	private Date ticketIssuedDt;
	private float amount;
	private JourneyBO journey;
	private PassengerBO passenger;
	
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Date getTicketIssuedDt() {
		return ticketIssuedDt;
	}
	public void setTicketIssuedDt(Date ticketIssuedDt) {
		this.ticketIssuedDt = ticketIssuedDt;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public JourneyBO getJourney() {
		return journey;
	}
	public void setJourney(JourneyBO journey) {
		this.journey = journey;
	}
	public PassengerBO getPassenger() {
		return passenger;
	}
	public void setPassenger(PassengerBO passenger) {
		this.passenger = passenger;
	}
}
