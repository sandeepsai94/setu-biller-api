package com.setu.biller.entity;

import java.sql.Date;

public class ReceiptResponse {

	private String billerBillID;
	private String platformBillID;
	private String platformTransactionRefID;
	private Receipt receipt;
	
	
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


	public String getPlatformTransactionRefID() {
		return platformTransactionRefID;
	}

	public void setPlatformTransactionRefID(String platformTransactionRefID) {
		this.platformTransactionRefID = platformTransactionRefID;
	}


	public Receipt getReceipt() {
		return receipt;
	}


	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}


	public static class Receipt {
	    private String id;
	    private Date date;
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}

	    
	}
	
}

