package com.setu.biller.entity;

public class CustomerBill {

    private Customer customer;
    private BillDetails billDetails;

    public CustomerBill() {

    }

    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BillDetails getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}

	public static class Customer {
	    private String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}
    
    public static class BillDetails {
	    private String billFetchStatus;
	    private Bill bills;
		public String getBillFetchStatus() {
			return billFetchStatus;
		}
		public void setBillFetchStatus(String billFetchStatus) {
			this.billFetchStatus = billFetchStatus;
		}
		public Bill getBills() {
			return bills;
		}
		public void setBills(Bill bills) {
			this.bills = bills;
		} 

	    
	}
    
    
}