package com.baeldung.login;

import com.baeldung.model.Customer;
//import org.springframework.stereotype.Component;
//
//@Component
public class LoginSimpleService implements LoginService {

    public Customer createCustomerLogin(Login login)   {
       try {
           Customer customer=new Customer();
           customer.setCustomerLogin(login);
	   return customer;
       }
       catch (Exception e) {
          e.printStackTrace();
	  return null;
       }
    }
}
