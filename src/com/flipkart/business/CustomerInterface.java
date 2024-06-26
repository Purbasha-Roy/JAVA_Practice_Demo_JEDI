/**
 * 
 */
package com.flipkart.business;

/**
 * 
 */
public interface CustomerInterface {
	public void createCustomer();
	public boolean updateCustomer(int custID);
	public boolean deleteCustomer(int custID);
	public void listCustomer();	
}
