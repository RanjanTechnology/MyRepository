package com.bus.dto;

import java.util.Date;

public class JourneyDto {
	
	private int journeyID;
	private String source;
	private String dest;
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
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	
}
