package ars.beans;

import java.util.List;

public class Aircraft 
{
	private Long aircraftID; //Vehicle Identification Number or ID
	private String manufacturerName; //Aircraft Manufacturer
	private String modelName; //Model of Aircraft
	private Long airlineLinkID; //Airlines hat owns the aircraft
	private Long flightLinkID;
	private List seats;
	
	public Long getAircraftID() {
		return aircraftID;
	}
	public void setAircraftID(Long aircraftID) {
		this.aircraftID = aircraftID;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Long getAirlineLinkID() {
		return airlineLinkID;
	}
	public void setAirlineLinkID(Long airlineLinkID) {
		this.airlineLinkID = airlineLinkID;
	}
	public Long getFlightLinkID() {
		return flightLinkID;
	}
	public void setFlightLinkID(Long flightLinkID) {
		this.flightLinkID = flightLinkID;
	}
	public List getSeats() {
		return seats;
	}
	public void setSeats(List seats) {
		this.seats = seats;
	}
	
}
