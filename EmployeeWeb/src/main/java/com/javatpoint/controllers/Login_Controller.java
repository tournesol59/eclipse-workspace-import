package com.javatpoint.controllers;

import com.javatpoint.models.Emp;
import com.javatpoint.models.JdbcModel;
import com.javatpoint.models.Login_Model;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import javax.servlet.http.HttpSession;

@Controller
public class Login_Controller {

  // fred: first a very basic class
   @RequestMapping(value="javatpoint/emplogin", method=RequestMethod.POST)
   public String do_login(HttpServletRequest request, Model md, Session session) // Session and Model after
    try {
      //
      String empname=request.getParameter("empname");
      String password=request.getParameter("password");

      System.out.println("Empname and password are : "+empname+" "+password);
      Login_Model lm = new Login_Model();
      String message = lm.do_login_process(empname, password);

      if (message.equals("login success"))
      {
        //session.setAttribute("empname", empname);
	return "redirect:/myprofile";
      }
      else
      {
         md.addAttribute("error_msg", message);
      }
      return "login";
      }
    catch (Exception e)
    {
      return "login";
    }
  }
// fred: my first concept, but the return output must be ModelAndView
      //      String msg;
//      ModelAndView mav;
//      if (empname=="Smith") {
//	      msg="hello";
//      } 
//      else {
//	      msg="not registered";
//      }
//         return mav = new ModelAndView("dologin", "msg", msg);
// corrected: 
/**
  public static void main(String[] args) {
     String empname="nom2";
     String password="pass";
     try {
        Login_Model lm=new Login_Model();
    
        String msg = lm.do_login_process(empname, password) ;
        System.out.println(msg);
     }
     catch(SQLException e) {
        System.out.println("error in login process");
     }
  }
**/
}// end class

