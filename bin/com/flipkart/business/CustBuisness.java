package com.flipkart.business;

import com.flipkart.bean.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustBuisness implements CustomerInterface {
    // ASSIGNMENT 9

    // add
    // update
    // delete
    // list

    List<Customer> customerList = new ArrayList<>();

    public void createCustomer() {
        System.out.println("Customer created");

        // add first record
        Customer customer1 = new Customer();
        customer1.setCustomerID(101);
        customer1.setCustomerName("abc");
        customer1.setCustomerAddress("Bangalore");
        customerList.add(customer1);

        // add second record
        Customer customer2 = new Customer();
        customer2.setCustomerID(102);
        customer2.setCustomerName("pqr");
        customer2.setCustomerAddress("Hyd");
        customerList.add(customer2);

        // add third record
        Customer customer3 = new Customer();
        customer3.setCustomerID(103);
        customer3.setCustomerName("xyz");
        customer3.setCustomerAddress("Delhi");
        customerList.add(customer3);
    }

    public boolean updateCustomer(int custID) {
        boolean updated = false;

        for (Customer customer : customerList) {
            if (customer.getCustomerID() == custID) {
                System.out.println("Updating customer: " + custID);

                customer.setCustomerName("abcde");
                customer.setCustomerAddress("Chennai");
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
        boolean deleted = false;

        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerID() == custID) {
                System.out.println("Deleting customer: " + custID);
                customerList.remove(i);
                deleted = true;
                break;
            }
        }

        if (!deleted) {
            System.out.println("Customer with ID " + custID + " not found.");
        }

        return deleted;
    }

    public void listCustomer() {
        System.out.println("Customers displayed here");

        for (Customer customer : customerList) {
            System.out.println("Details of customer: " + customer.getCustomerID() + " - " + customer.getCustomerName() + " - " + customer.getCustomerAddress());
        }
    }
}
