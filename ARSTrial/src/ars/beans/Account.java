package ars.beans;

import java.sql.Timestamp;

public class Account 
{
	private Long accountID;
	private ars.enums.bank bank;
	private Long netID;
	private String netPass;
	private ars.enums.paymentPlatform paymentPlatform;
	private ars.enums.cardType cardType;
	private Long cardNo;
	private int cvv;
	private Timestamp expiryDate;
	private double balance;
	private Long userLinkID=null;
	
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}
	public Long getUserLinkID() {
		return userLinkID;
	}
	public void setUserLinkID(Long userLinkID) {
		this.userLinkID = userLinkID;
	}
	
	public ars.enums.bank getBank() {
		return bank;
	}
	public void setBank(ars.enums.bank bank) {
		this.bank = bank;
	}
	public Long getNetID() {
		return netID;
	}
	public void setNetID(Long netID) {
		this.netID = netID;
	}
	public String getNetPass() {
		return netPass;
	}
	public void setNetPass(String netPass) {
		this.netPass = netPass;
	}
	public ars.enums.paymentPlatform getPaymentPlatform() {
		return paymentPlatform;
	}
	public void setPaymentPlatform(ars.enums.paymentPlatform paymentPlatform) {
		this.paymentPlatform = paymentPlatform;
	}
	public ars.enums.cardType getCardType() {
		return cardType;
	}
	public void setCardType(ars.enums.cardType cardType) {
		this.cardType = cardType;
	}
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Timestamp getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
