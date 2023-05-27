package com.javatpoint.controllers;

import com.javatpoint.models.Emp;
import com.javatpoint.models.JdbcModel;
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

@Controller
public class EmpController {
   private static final String SERVER="localhost", BD="eltechdb", LOGIN="fred", PASSWORD="lpf6lmsql", VIEWS="/javatpoint";  
   private int id=0;
   JdbcModel jdbcmdl;
      // definition of HashMap that contains the list of the request results
   List<Emp> reslist;
   List<Map<String,String>> resultsprnt;

     @RequestMapping(value="/javatpoint/viewemp", method=RequestMethod.GET)
    public ModelAndView viewemp() { 
        ModelAndView mav;
	try {
	  // write code to read object from the DB
          resultsprnt = jdbcmdl.searchEmpA();
	}
        catch (Exception e) {
          System.out.println("Erreur d ecriture d une table");
	}
	return mav=new ModelAndView("listemp", "list", resultsprnt);
   }

/*
 *
     @RequestMapping(value="/javatpoint/viewemp", method=RequestMethod.GET)
   public ModelAndView emplist() {
   if (ServletFileUpload.isMultipartContent(reques).parseRequest(request));
   {
      try {
         List<FileItem> data = new ServletFileUpload(new DiskFileItemFactory().) 
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
   }
 }
   
     @RequestMapping(value="/javatpoint/empform", method=RequestMethod.POST)
  // fred: corresponds to jsp page addemp.jsp
   public ModelAndView showform() {
	// procedure which create the Jdbc object, get action to do and perform index (Connect to db), create new Emp
	JdbcModel jdbcmdl = JdbcModel();
	String empname=request.getParameter("empname");
	String gender=request.getParameter("gender");
	String birthdate=request.getParameter("birthdate");

        try {
          jdbcmdl.connect(SERVER,BD,LOGIN,PASSWORD);
	}
	catch (SQLException e) {
          System.out.println("Erreur de connection a la base de donnees");
	}
	//command is a reserved request attribute name, now use <form> tag to show object data
	id++;
	return new ModelAndView("empform", "command", new Emp(id,empname,empname,gender,birthdate,"26th October 2021"));
	
   }

  @RequestMapping(value="/javatpoint/empsave", method=RequestMethod.POST)
   public ModelAndView empsave(@ ModelAttribute("emp") Emp emp) { 
	// fred: comment cette proc recoit elle un objet emp qui n est pas 
	try {
	  // write code to save object in the DB
          // here we simply print to screen
	  System.out.println(emp.getLastName()+" "+emp.getGender()+" "+emp.getBirthDate());
	}
        catch (Exception e) {
          System.out.println("Erreur d ecriture d'une table");
	}
	return new ModelAndView("redirect:/viewemp");
   }
*
*/
}// end class
