package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

public class CustomerClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// client->business->bean
//		CustomerBusiness service = new CustomerBusiness();
		CustomerInterface service = new CustomerBusiness();		
		service.createCustomer();
//		System.out.println("update customer -> " + service.updateCustomer(101));
//		System.out.println("delete customer -> " + service.deleteCustomer(101));
		
		service.listCustomer();
	}

}
