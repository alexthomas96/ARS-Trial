package ars.beans;
public class PersonalDetails 
{
	private Long detailsID;
	private String firstName;
	private String lastName;
	private ars.enums.ageGroup ageGroup;
	private ars.enums.sex sex;
	private ars.enums.idType idType;
	private String idNo;
	private Long userLinkID=null;
	private Long ticketLinkID=null;
	
	public Long getDetailsID() {
		return detailsID;
	}
	public void setDetailsID(long detailsID) {
		this.detailsID = detailsID;
	}
	public Long getUserLinkID() {
		return userLinkID;
	}
	public void setUserLinkID(Long userLinkID) {
		this.userLinkID = userLinkID;
	}
	public Long getTicketLinkID() {
		return ticketLinkID;
	}
	public void setTicketLinkID(Long ticketLinkID) {
		this.ticketLinkID = ticketLinkID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ars.enums.ageGroup getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(ars.enums.ageGroup ageGroup) {
		this.ageGroup = ageGroup;
	}
	public ars.enums.sex getSex() {
		return sex;
	}
	public void setSex(ars.enums.sex sex) {
		this.sex = sex;
	}
	public ars.enums.idType getIdType() {
		return idType;
	}
	public void setIdType(ars.enums.idType idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
}
