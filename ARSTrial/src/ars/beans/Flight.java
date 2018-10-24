package ars.beans;

import java.sql.Timestamp;
import java.util.List;

import ars.enums.*;

public class Flight 
{
	private Long flightID;
	private Long aircraftLinkID;
	private Timestamp departTime;
	private Timestamp arriveTime;
	private String departCode;
	private String arriveCode;
	private flightStatus flightStatus;
	private flightType flightType;
	private List seatsLeft;
	private List ageFare;
	private List classFare;
	
	public Long getFlightID() {
		return flightID;
	}
	public void setFlightID(Long flightID) {
		this.flightID = flightID;
	}
	public Long getAircraftLinkID() {
		return aircraftLinkID;
	}
	public void setAircraftLinkID(Long aircraftLinkID) {
		this.aircraftLinkID = aircraftLinkID;
	}
	public Timestamp getDepartTime() {
		return departTime;
	}
	public void setDepartTime(Timestamp departTime) {
		this.departTime = departTime;
	}
	public Timestamp getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Timestamp arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getDepartCode() {
		return departCode;
	}
	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}
	public String getArriveCode() {
		return arriveCode;
	}
	public void setArriveCode(String arriveCode) {
		this.arriveCode = arriveCode;
	}
	public flightStatus getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(flightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}
	public flightType getFlightType() {
		return flightType;
	}
	public void setFlightType(flightType flightType) {
		this.flightType = flightType;
	}
	public List getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(List seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public List getAgeFare() {
		return ageFare;
	}
	public void setAgeFare(List ageFare) {
		this.ageFare = ageFare;
	}
	public List getClassFare() {
		return classFare;
	}
	public void setClassFare(List classFare) {
		this.classFare = classFare;
	}
	
	
}
