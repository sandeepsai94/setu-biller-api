package com.setu.biller.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.setu.biller.entity.Amount;
import com.setu.biller.entity.Bill;
import com.setu.biller.entity.CustomerBill;
import com.setu.biller.entity.CustomerDetails;
import com.setu.biller.entity.CustomerIdentifiers;
import com.setu.biller.entity.ReceiptRequest;
import com.setu.biller.entity.ReceiptResponse;
import com.setu.biller.exception.ResourceNotFoundException;
import com.setu.biller.repository.CustomerRepository;



@RestController
@RequestMapping("/bills")
public class CustomerController {
    
	@Autowired
    private CustomerRepository customerRepository;
	
	Logger log = Logger.getLogger(CustomerController.class.getName());
    
    @PostMapping("/fetch")
    public ResponseEntity <CustomerBill> fetch(@RequestBody CustomerIdentifiers customerIdentifiers)
    throws ResourceNotFoundException {
    	
    	
    	CustomerDetails customerDetails = customerRepository.findByCustomerId(customerIdentifiers.getAttributeValue());  
    	
    	if (customerDetails==null) {
    		
    	throw new ResourceNotFoundException("Customer: "+customerIdentifiers.getAttributeValue()+ " not Found" );
    	
    	}		
    	CustomerBill customerBill = new CustomerBill();
    	
    	CustomerBill.Customer customer = new CustomerBill.Customer();
    	customer.setName(customerDetails.getName());
    	customerBill.setCustomer(customer);
    	
    	CustomerBill.BillDetails billDetails = new CustomerBill.BillDetails();
    	billDetails.setBillFetchStatus(customerDetails.getBillFetchStatus());
    	
    	if ("NO_OUTSTANDING".equals(customerDetails.getBillFetchStatus())) {
    		billDetails.setBills(null);;
    	}else
    	{
    	Bill.CustomerAccount customerAccount = new Bill.CustomerAccount();
    	customerAccount.setId(customerDetails.getCustomerId());
    	
    	Amount billAmount = new Amount();
    	billAmount.setValue(customerDetails.getBill());
    	
    	Bill.Aggregates.BillType billType = new Bill.Aggregates.BillType();
    	billType.setAmount(billAmount);
    	billType.setDisplayName(customerDetails.getDisplayName());
    	
    	Bill.Aggregates aggregates = new Bill.Aggregates();
    	aggregates.setTotal(billType);
    	
    	Bill bill = new Bill();
    	bill.setAmountExactness(customerDetails.getAmountExactness());
    	bill.setBillerBillID(customerDetails.getBillerBillId());
    	bill.setGeneratedOn(customerDetails.getGeneratedOn());
    	bill.setRecurrence(customerDetails.getRecurrence());
    	bill.setAggregates(aggregates);
    	bill.setCustomerAccount(customerAccount);
    	
    	billDetails.setBills(bill);
    	}
    	customerBill.setBillDetails(billDetails);
    	
        return ResponseEntity.ok().body(customerBill);
    	
    }

    @PostMapping("/fetchReceipt")
    public ResponseEntity<ReceiptResponse> fetchReceipt(@RequestBody ReceiptRequest receiptRequest) throws ResourceNotFoundException {
		
    	ReceiptResponse receiptResponse = new ReceiptResponse();
    	
		
    	CustomerDetails customerDetails = customerRepository.findByBillerBillId(receiptRequest.getBillerBillID()) ;
		 
		if (customerDetails==null) {
    		
	    	throw new ResourceNotFoundException("Customer with billerId: "+receiptRequest.getBillerBillID()+ " not Found" );
	    	
	    }
    	
    	receiptResponse.setBillerBillID(receiptRequest.getBillerBillID());
    	receiptResponse.setPlatformBillID(receiptRequest.getPlatformBillID());
    	receiptResponse.setPlatformTransactionRefID(receiptRequest.getPaymentDetails().getPlatformTransactionRefID());
    	
    	ReceiptResponse.Receipt receipt = new ReceiptResponse.Receipt();
    	receipt.setId(customerDetails.getReceiptId());
    	receipt.setDate(customerDetails.getPaymentDate());
    	
    	customerRepository.updateBillFetchStatus(receiptRequest.getBillerBillID());
    	
		/*
		 * CustomerBill customerBill = new CustomerBill();
		 * 
		 * CustomerBill.Customer customer = new CustomerBill.Customer();
		 * customer.setName(customerDetails.getName());
		 * customerBill.setCustomer(customer);
		 * 
		 * CustomerBill.BillDetails billDetails = new CustomerBill.BillDetails();
		 * billDetails.setBillFetchStatus("NO_OUTSTANDING"); billDetails.setBills(null);
		 */
    	
    	receiptResponse.setReceipt(receipt);
    	return ResponseEntity.ok().body(receiptResponse);
    }
    
	/*
	 * @RequestMapping(value = "/authenticate", method = RequestMethod.POST) public
	 * ResponseEntity<?> createAuthenticationToken(@RequestBody
	 * AuthenticationRequest authenticationRequest) throws Exception {
	 * 
	 * try { authenticationManager.authenticate( new
	 * UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
	 * authenticationRequest.getPassword()) ); } catch (BadCredentialsException e) {
	 * throw new Exception("Incorrect username or password", e); }
	 * 
	 * 
	 * final UserDetails userDetails = userDetailsService
	 * .loadUserByUsername(authenticationRequest.getUsername());
	 * 
	 * final String jwt = jwtTokenUtil.generateToken(userDetails);
	 * 
	 * return ResponseEntity.ok(new AuthenticationResponse(jwt)); }
	 */


}