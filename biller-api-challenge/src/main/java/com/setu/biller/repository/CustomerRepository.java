package com.setu.biller.repository;
  

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
  
import com.setu.biller.domain.CustomerDetails;
import com.setu.biller.domain.User;
  
  @Repository 
  public interface CustomerRepository extends CrudRepository<CustomerDetails, String>{
	  
	
	  public CustomerDetails findByCustomerId(String id);
	  
	  public void updateBillFetchStatus(String billerBillId); 
	  
	  public CustomerDetails findByBillerBillId(String billerBillId);
	  
  }
 