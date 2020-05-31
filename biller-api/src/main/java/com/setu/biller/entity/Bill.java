package com.setu.biller.entity;

import java.util.Date;

public class Bill {

	public Bill() {
		super();
	}

	private String billerBillID;
	private Date generatedOn;
	private String recurrence;
	private String amountExactness;
	private CustomerAccount customerAccount;
	private Aggregates aggregates;
	
	
	public String getBillerBillID() {
		return billerBillID;
	}

	public void setBillerBillID(String billerBillID) {
		this.billerBillID = billerBillID;
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

	public String getAmountExactness() {
		return amountExactness;
	}

	public void setAmountExactness(String amountExactness) {
		this.amountExactness = amountExactness;
	}

	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	public Aggregates getAggregates() {
		return aggregates;
	}

	public void setAggregates(Aggregates aggregates) {
		this.aggregates = aggregates;
	}

	public static class CustomerAccount {
	    private String id;

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }
	}
	
	public static class Aggregates {
	    
		private BillType total;

		public BillType getTotal() {
			return total;
		}

		public void setTotal(BillType total) {
			this.total = total;
		}
		
		public static class BillType {
			
			private String displayName;
			private Amount amount;
			public String getDisplayName() {
				return displayName;
			}
			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
			public Amount getAmount() {
				return amount;
			}
			public void setAmount(Amount amount) {
				this.amount = amount;
			}
			
		}
	    
	}
	
}