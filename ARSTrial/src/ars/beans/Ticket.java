package ars.beans;

import ars.enums.*;

public class Ticket 
{
	private Long ticketID;
	private Long flightLinkID;
	private Long detailsLinkID;
	private Long userLinkID;
	private seatClass seatClass;
	private Long seatNo;
	private Long fare;
	
	public Long getUserLinkID() {
		return userLinkID;
	}
	public void setUserLinkID(Long userLinkID) {
		this.userLinkID = userLinkID;
	}
	public Long getTicketID() {
		return ticketID;
	}
	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}
	public Long getFlightLinkID() {
		return flightLinkID;
	}
	public void setFlightLinkID(Long flightLinkID) {
		this.flightLinkID = flightLinkID;
	}
	public Long getDetailsLinkID() {
		return detailsLinkID;
	}
	public void setDetailsLinkID(Long detailsLinkID) {
		this.detailsLinkID = detailsLinkID;
	}
	public seatClass getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(seatClass seatClass) {
		this.seatClass = seatClass;
	}
	public Long getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(Long seatNo) {
		this.seatNo = seatNo;
	}
	public Long getFare() {
		return fare;
	}
	public void setFare(Long fare) {
		this.fare = fare;
	}
	
	
}
