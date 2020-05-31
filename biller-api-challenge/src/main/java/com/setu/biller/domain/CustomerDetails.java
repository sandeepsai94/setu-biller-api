package com.setu.biller.domain;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerDetails {

    private String id;
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
    

    public CustomerDetails() {

    }

    @Id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "bill", nullable = false)
    public String getBill() {
        return bill;
    }
    public void setBill(String bill) {
        this.bill = bill;
    }

    @Column(name = "billFetchStatus")
    public String getBillFetchStatus() {
        return billFetchStatus;
    }
    public void setBillFetchStatus(String billFetchStatus) {
        this.billFetchStatus = billFetchStatus;
    }
    
    @Column(name = "billerBillId")
    public String getBillerBillId() {
        return billerBillId;
    }
    public void setBillerBillId(String billerBillId) {
        this.billerBillId = billerBillId;
    }
    
    @Column(name = "generationDate")
	public Date getGeneratedOn() {
		return generatedOn;
	}
    
    public void setGeneratedOn(Date generatedOn) {
		this.generatedOn = generatedOn;
	}
    
    @Column(name = "amountExactness")
    public String getAmountExactness() {
		return amountExactness;
	}

	public void setAmountExactness(String amountExactness) {
		this.amountExactness = amountExactness;
	}
	
	@Column(name = "recurrence")
	public String getRecurrence() {
		return recurrence;
	}
	
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	@Column(name = "displayName")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	@Column(name = "platformBillId")
	public String getPlatformBillId() {
		return platformBillId;
	}

	public void setPlatformBillId(String platformBillId) {
		this.platformBillId = platformBillId;
	}
	
	@Column(name = "platformTransactionRefId")
	public String getPlatformTransactionRefId() {
		return platformTransactionRefId;
	}

	public void setPlatformTransactionRefId(String platformTransactionRefId) {
		this.platformTransactionRefId = platformTransactionRefId;
	}
	
	@Column(name = "uniquePaymentRefId")
	public String getUniquePaymentRefId() {
		return uniquePaymentRefId;
	}

	public void setUniquePaymentRefId(String uniquePaymentRefId) {
		this.uniquePaymentRefId = uniquePaymentRefId;
	}
	
	@Column(name = "receiptId")
	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	
	@Column(name = "paymentDate")
	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
    
    
}