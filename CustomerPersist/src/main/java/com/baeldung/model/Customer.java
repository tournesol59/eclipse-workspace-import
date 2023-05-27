package com.baeldung.model;

import java.util.List;
import java.util.Set;
import com.baeldung.login.Login;
import com.baeldung.model.Event;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int customerId;

    private Login customerLogin; // see after
    private String customerName;
    private String customerContact;
    private String customerEmail;

//    private Set<Login> customerLogins; // but has unique

    private Set<Event> customerEvents;

    public Customer() {
        super();
    }

    public Customer(int id, Login login, String name, String contact, String email) {
        super();
	this.customerId = id;
	this.customerLogin = login;
	this.customerName = name;
	this.customerContact = contact;
	this.customerEmail = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Login getCustomerLogin() {
        return customerLogin;
    }

    public void setCustomerLogin(Login customerLogin) {
        this.customerLogin = customerLogin;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void test() {
        System.out.println(customerName);
    }

    public List<Customer> getAllCustomers() {
        System.out.println("Customer.getAllCustomers called");
        return null;
    }    
/*
    public Set<Login> getCustomerLogin() {
        return customerLogin;
    }

    public void setCustomerLogin(Set<Login> logins) {
        this.customerEvents = logins;
    }
*/
    public Set<Event> getCustomerEvents() {
        return customerEvents;
    }

    public void setCustomerEvents(Set<Event> events) {
        this.customerEvents = events;
    }

}

