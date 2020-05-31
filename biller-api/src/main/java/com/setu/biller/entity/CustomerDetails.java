package com.setu.biller.entity;

import java.util.Date;

public class CustomerDetails {

	
	private String customerId;
    private String name;
    private String bill;
    private String billFetchStatus;
    private String billerBillId;
    private String amountExactness;
	private Date generatedOn;
    private String recurrence;
    private String displayName;
    private String platformBillId;
    private String platformTransactionRefId;
    private String uniquePaymentRefId;
    private String receiptId;
    private Date paymentDate;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public String getBillFetchStatus() {
		return billFetchStatus;
	}
	public void setBillFetchStatus(String billFetchStatus) {
		this.billFetchStatus = billFetchStatus;
	}
	public String getBillerBillId() {
		return billerBillId;
	}
	public void setBillerBillId(String billerBillId) {
		this.billerBillId = billerBillId;
	}
	public String getAmountExactness() {
		return amountExactness;
	}
	public void setAmountExactness(String amountExactness) {
		this.amountExactness = amountExactness;
	}
	public Date getGeneratedOn() {
		return generatedOn;
	}
	public void setGeneratedOn(Date generatedOn) {
		this.generatedOn = generatedOn;
	}
	public String getRecurrence() {
		return recurrence;
	}
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPlatformBillId() {
		return platformBillId;
	}
	public void setPlatformBillId(String platformBillId) {
		this.platformBillId = platformBillId;
	}
	public String getPlatformTransactionRefId() {
		return platformTransactionRefId;
	}
	public void setPlatformTransactionRefId(String platformTransactionRefId) {
		this.platformTransactionRefId = platformTransactionRefId;
	}
	public String getUniquePaymentRefId() {
		return uniquePaymentRefId;
	}
	public void setUniquePaymentRefId(String uniquePaymentRefId) {
		this.uniquePaymentRefId = uniquePaymentRefId;
	}
	public String getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public CustomerDetails(String customerId, String name, String bill, String billFetchStatus, String billerBillId,
			String amountExactness, Date generatedOn, String recurrence, String displayName, String platformBillId,
			String platformTransactionRefId, String uniquePaymentRefId, String receiptId, Date paymentDate) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.bill = bill;
		this.billFetchStatus = billFetchStatus;
		this.billerBillId = billerBillId;
		this.amountExactness = amountExactness;
		this.generatedOn = generatedOn;
		this.recurrence = recurrence;
		this.displayName = displayName;
		this.platformBillId = platformBillId;
		this.platformTransactionRefId = platformTransactionRefId;
		this.uniquePaymentRefId = uniquePaymentRefId;
		this.receiptId = receiptId;
		this.paymentDate = paymentDate;
	}
    
    
    
}
