package ars.models;
public class Details 
{
	private Long detailsID;
	private String firstName;
	private String lastName;
	private String ageGroup;
	private String sex;
	private String idType;
	private String idNo;
	private Long userLinkID;
	
	
	public Long getUserLinkID() {
		return userLinkID;
	}
	public void setUserLinkID(Long userLinkID) {
		this.userLinkID = userLinkID;
	}
	public Long getDetailsID() {
		return detailsID;
	}
	public void setDetailsID(Long detailsID) {
		this.detailsID = detailsID;
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
	public String getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	
}
