package ars.models;

import java.sql.Timestamp;

import ars.beans.User;

public class Accounts 
{
	private Long accountID;
	private String bank;
	private Long netID;
	private String netPass;
	private String paymentPlatform;
	private String cardType;
	private Long cardNo;
	private int cvv;
	private String expiryDate;
	private double balance;
	
	private Long userLinkID=null;
	
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
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
	public String getPaymentPlatform() {
		return paymentPlatform;
	}
	public void setPaymentPlatform(String paymentPlatform) {
		this.paymentPlatform = paymentPlatform;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
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
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Long getUserLinkID() {
		return userLinkID;
	}
	public void setUserLinkID(Long userLinkID) {
		this.userLinkID = userLinkID;
	}
	
}
