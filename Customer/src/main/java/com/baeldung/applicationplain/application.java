package com.baeldung.applicationplain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baeldung.model.Customer;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // ApplicationContext context = new FileSystemXmlApplicationContext("spring-bean-customer.xml");
//applicationcontext/account-bean-config.xm		
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-customer.xml");
        Customer cust1 = (Customer) context.getBean("customer");
        System.out.println(cust1.getCustomerName());
    	
        ((ClassPathXmlApplicationContext) context).close();
    	
	}


}
