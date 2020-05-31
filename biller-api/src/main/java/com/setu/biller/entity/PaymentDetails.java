package com.setu.biller.entity;

public class PaymentDetails {

	private String platformTransactionRefID;
	private String uniquePaymentRefID;
	private Amount amountPaid;
	private Amount billAmount;
	
	public String getPlatformTransactionRefID() {
		return platformTransactionRefID;
	}

	public void setPlatformTransactionRefID(String platformTransactionRefID) {
		this.platformTransactionRefID = platformTransactionRefID;
	}

	public String getUniquePaymentRefID() {
		return uniquePaymentRefID;
	}

	public void setUniquePaymentRefID(String uniquePaymentRefID) {
		this.uniquePaymentRefID = uniquePaymentRefID;
	}

	public Amount getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Amount amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Amount getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Amount billAmount) {
		this.billAmount = billAmount;
	}

	
	
}
