package com.setu.biller.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.setu.biller.domain.Customers;
import com.setu.biller.entity.CustomerDetails;

  
  @Repository 
  public interface CustomerRepository extends JpaRepository<Customers, String>{
	  
	  @Query("SELECT new com.setu.biller.entity.CustomerDetails(c.customerId, c.name, c.bill, c.billFetchStatus, c.billerBillId, c.amountExactness, c.generatedOn, c.recurrence, c.displayName, c.platformBillId, c.platformTransactionRefId, c.uniquePaymentRefId, c.receiptId, c.paymentDate) FROM Customers c WHERE customerId = :customerId")
	  public CustomerDetails findByCustomerId(@Param("customerId") String customerId);
	  
	  @Query("SELECT new com.setu.biller.entity.CustomerDetails(c.customerId, c.name, c.bill, c.billFetchStatus, c.billerBillId, c.amountExactness, c.generatedOn, c.recurrence, c.displayName, c.platformBillId, c.platformTransactionRefId, c.uniquePaymentRefId, c.receiptId, c.paymentDate) FROM Customers c WHERE billerBillId = :billerBillId")
	  public CustomerDetails findByBillerBillId(@Param("billerBillId") String billerBillId);
	  
	  @Transactional
	  @Modifying
	  @Query("update Customers c set c.billFetchStatus = 'NO_OUTSTANDING' where c.billerBillId = :billerBillId")
	  int updateBillFetchStatus(@Param("billerBillId") String billerBillId);
  }