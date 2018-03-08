package com.bus.bo;

import java.util.Date;

public class JourneyBO {
	
	private int journeyID;
	private String source;
	private String destination;
	private Date journeyDate;
	public int getJourneyID() {
		return journeyID;
	}
	public void setJourneyID(int journeyID) {
		this.journeyID = journeyID;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	
}
