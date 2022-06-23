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
@RequestMapping("login")  // fred check /
public class LoginController {
  //@Autowired
	
	
  private LoginService service;

  @RequestMapping(value="login.spring", method=RequestMethod.GET)
  public ModelAndView prepareLoginForm() {
      System.out.println("In get");
      return new ModelAndView("Login","login",new Login());

  }

/*  @RequestMapping(value="login.spring", method=RequestMethod.POST) 
  public ModelAndView processLogin(@ModelAttribute("login") Login login, BindingResult result) {
      int i=service.validateLogin(login);
      if (i==0) {
          return new ModelAndView("redirect login.spring");
      }
      ModelAndView view=new ModelAndView("redirect.Customer/SearchForm.spring");
      return view;
  }
  */
}
