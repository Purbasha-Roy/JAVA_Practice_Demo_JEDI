/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * 
 */
public class CustomerBusiness implements CustomerInterface{
// ASSIGNMENT 8
	// add
	// update
	//	delete
	//	list
	
	Customer customer[] = new Customer[3];
	
	public void createCustomer() {
		System.out.println("Customer created");
		// add first record
		customer[0] = new Customer();
		customer[0].setCustomerID(101);
		customer[0].setCustomerName("abc");
		customer[0].setCustomerAddress("Bangalore");
		
		// add second record
		customer[1] = new Customer();
		customer[1].setCustomerID(102);
		customer[1].setCustomerName("pqr");
		customer[1].setCustomerAddress("Hyd");
		
		// add third record
		customer[2] = new Customer();
		customer[2].setCustomerID(103);
		customer[2].setCustomerName("xyz");
		customer[2].setCustomerAddress("delhi");
	}
	
	public boolean updateCustomer(int custID) {
//		System.out.println("Customer updated is " + custID);
		boolean updated = false;
	    
	    for (int i = 0; i < customer.length; i++) {
	        if (customer[i] != null && customer[i].getCustomerID() == custID) {
	            
	            System.out.println("Updating customer: " + custID);

	            customer[i].setCustomerName("abcde");
	            customer[i].setCustomerAddress("chennai");
	            updated = true;
	            break;
	        }
	    }
	    
	    if (!updated) {
	        System.out.println("Customer with ID " + custID + " not found.");
	    }
	    
	    return updated;
	}
	
	public boolean deleteCustomer(int custID) {
//		System.out.println("Customer deleted is " + custID);
		boolean deleted = false;
	    
	    for (int i = 0; i < customer.length; i++) {
	        if (customer[i] != null && customer[i].getCustomerID() == custID) {

	            System.out.println("Deleting customer: " + custID);
	            customer[i] = null;	            
	            deleted = true;
	            break;
	        }
	    }
	    
	    if (!deleted) {
	        System.out.println("Customer with ID " + custID + " not found.");
	    }
	    
	    return deleted;

	}
	
	public void listCustomer(){
		System.out.println("Customers displayed here");
		
		for(Customer customer: customer) {
			System.out.println("Details of customer:" + customer.getCustomerID() + "-" + customer.getCustomerName() + "-" + customer.getCustomerAddress());
		}
	}
	}
