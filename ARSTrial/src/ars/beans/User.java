package ars.beans;

import java.util.List;
import ars.globals.*;
public class User 
{
	private Long userID;
	private String username;
	private String password;
	//private List tickets;
	private ars.enums.user userType;
	private Long detailsLinkID=null;
	private Long accountLinkID=null;
	
	public Long getDetailsLinkID() {
		return detailsLinkID;
	}
	public void setDetailsLinkID(Long detailsLinkID) {
		this.detailsLinkID = detailsLinkID;
	}
	public Long getAccountLinkID() {
		return accountLinkID;
	}
	public void setAccountLinkID(Long accountLinkID) {
		this.accountLinkID = accountLinkID;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public List getTickets() {
		return tickets;
	}
	public void setTickets(List tickets) {
		this.tickets = tickets;
	}*/
	public ars.enums.user getUserType() {
		return userType;
	}
	public void setUserType (ars.enums.user userType) {
		this.userType = userType;
	}
}
