package com.baeldung.service;

import java.util.List;
import com.baeldung.model.Customer;
import com.baeldung.login.Login;
import com.baeldung.login.LoginService;
import com.baeldung.service.CustomerService;
import org.springframework.stereotype.Component;

public class CustomerSimpleService implements CustomerService {
       
    public static int customerId;

    public CustomerSimpleService() {
       super();
       customerId = 0;

    }

    public Customer createCustomer(Customer customer) {
        // stub (nothing for the moment, just demo ioc between customer and Login  
        customerId++;

	customer.setCustomerId(customerId);

        return customer;
    }

  //  @Autowired
  //  public void setCustomer(Customer customer) {
  //     System.out.println(" set Customer method called");
  //     this.customer = customer;
  //  }
    
  //  public List<Customer> getCustomers() {
  //     return customer.getAllCustomers();
  //  }

//fred
//    int searchCustomer(CustomerSearchForm customerSearchForm); // fred: if I would know how to pass the xml ac bean defining the Customer list to this class by IoC
    // I would implement a methid like this comparing the object to the first 
    // // objet return by getBeam(id) but .. is it OK? => test
   
    public Customer findCustomer(List<Customer> list, int id) {
      int i=0;
      try {
	 Customer customer2=null;
         for (Customer customer1 : list) {
	   if (customer1.getCustomerId() == id) {
	       customer2 = customer1;
               break;
	   }
	   else {
               i++;
	   }
         }
	 return customer2;
	 
      } catch (Exception e) {
          System.out.println("element with id: "+id+" not found");
	return null;
      }
    }


  //  void updateCustomer(Customer customer) {
  //       System.out.println("update method of CustomerService has been called");
  //	 this.customer = customer;
  //  }
    
}
