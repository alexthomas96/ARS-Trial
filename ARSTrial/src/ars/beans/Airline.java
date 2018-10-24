package ars.beans;

public class Airline 
{
	private Long airlineID; //ID no. of airline
	private String airlineName;   //name of Airlines
	private String latestOffer; //Promotional Scroll Text at Login
	private String airlineCode;
	
	public Long getAirlineID() {
		return airlineID;
	}
	public void setAirlineID(Long airlineID) {
		this.airlineID = airlineID;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getLatestOffer() {
		return latestOffer;
	}
	public void setLatestOffer(String latestOffer) {
		this.latestOffer = latestOffer;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	
}
