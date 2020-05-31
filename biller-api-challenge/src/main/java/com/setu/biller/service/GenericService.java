package com.setu.biller.service;


import com.setu.biller.domain.CustomerDetails;
import com.setu.biller.domain.User;

public interface GenericService {
    
	User findByUsername(String username);
	public CustomerDetails findByCustomerId(String id);
	  
	public void updateBillFetchStatus(String billerBillId); 
	  
	public CustomerDetails findByBillerBillId(String billerBillId);
}