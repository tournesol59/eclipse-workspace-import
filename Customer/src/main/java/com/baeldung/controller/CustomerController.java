package com.baeldung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.*;

import org.springframework.web.servlet.ModelAndView;


import com.baeldung.login.Login;
import com.baeldung.login.LoginService;
import com.baeldung.service.CustomerService;  // with import com.baeldung.model.Customer
import com.baeldung.form.CustomerSearchForm;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
	/**
  @Autowired
  private CustomerService customerService;

  @RequestMapping(value="Searchform.spring", method=RequestMethod.GET)
  public ModelAndView prepareCustomer() {
     System.out.println("In customer controller");
     CustomerSearchForm customerSearchForm = new CustomerSearchForm();
     	return new ModelAndView("CustomerSearch", "customerSearchForm", CustomerSearchForm);
  }
  @RequestMapping(value="Search.spring", method=RequestMethod.POST)
  public ModelAndView searchCustomer(@ModelAttribute("customer") CustomerSearchForm, customerSearchForm, BindingResult result) {
	  int i = customerService.searchCustomer(customerSearchForm);
	  if (i==1) return new ModelAndView("Holdings");
	  return new ModelAndView("redirect: Customer");

  }
  
  */
}
