package com.baeldung.controller;

import java.util.List;
import java.util.ArrayList;
import com.baeldung.login.Login;
import com.baeldung.model.Customer;
import com.baeldung.login.Login;
import com.baeldung.service.CustomerService;
import com.baeldung.service.CustomerSimpleService;

public class Compare_customer {
   
//   public static void main(String[] args) {
   public static void compare() {

      List<Customer> customerlist = new ArrayList<Customer>();

      int count;

      CustomerService csservice = new CustomerSimpleService();

//      CustomerSimpleService csservice = CustomerSimpleService();

      Login login1 = new Login(1, "liberty");

      Login login2 = new Login(2, "harmony");

      Customer customer1 = new Customer();     

      customer1.setCustomerLogin(login1);  // if from factory (next step)== dependency injection

      customerlist.add( csservice.createCustomer(customer1) ); // just a stub but not only: a counter "Id" is incremented

      count = customer1.getCustomerId();

      Customer customer2 = csservice.findCustomer(customerlist, count);

      System.out.println("Found an occurence, i: "+count+" login: "+customer2.getCustomerLogin().getName() ); 

   }

}

