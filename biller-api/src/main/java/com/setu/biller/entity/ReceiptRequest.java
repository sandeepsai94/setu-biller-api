package com.setu.biller.entity;

public class ReceiptRequest {

	private String billerBillID;
	private String platformBillID;
	private PaymentDetails paymentDetails;
	
	
	public String getBillerBillID() {
		return billerBillID;
	}
	public void setBillerBillID(String billerBillID) {
		this.billerBillID = billerBillID;
	}
	public String getPlatformBillID() {
		return platformBillID;
	}
	public void setPlatformBillID(String platformBillID) {
		this.platformBillID = platformBillID;
	}
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}	
	
	
}
