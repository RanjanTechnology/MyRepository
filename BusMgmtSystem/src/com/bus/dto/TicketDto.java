package com.bus.dto;

public class TicketDto {
	
	private int ticketNo;
	private JourneyDto journey;
	private String firstNm;
	private String lastNm;
	private int seatNo;
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public JourneyDto getJourney() {
		return journey;
	}
	public void setJourney(JourneyDto journey) {
		this.journey = journey;
	}
	public String getFirstNm() {
		return firstNm;
	}
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
}
