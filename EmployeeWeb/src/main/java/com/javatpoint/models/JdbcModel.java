package com.javatpoint.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.sql.*;

// @WebServlet("Jdbc")
 public class JdbcModel {
   // Jdbc connection parameters
   private static final Integer port=3306;
   private String server;
   private String db;
   private String login;
   private String password;
   
   public int getPort() {  // to demonstrate a very simple junit test
      return (int) port;
   }
   private Connection connection;
   
   public JdbcModel(String server, String db, String login, String password) {
		super();
		// this.port = port;
		this.server = server;
		this.db = db;
		this.login = login;
		this.password = password;
  }

// procedure that connect to the DB
   public void connect() throws SQLException 
   {
     String url="jdbc:mysql://"+server+":"+port+"/"+db;
     connection = DriverManager.getConnection(url, login, password);
   }

// procedure that perform a stmt.executeQuery but w/o presentation work
// which is bad practice
   public List<Emp> searchEmpTBC() throws SQLException
   {
      List<Emp> empslist = new ArrayList<Emp>();
      String requete = "SELECT * FROM employee";
      ResultSet results=null;

      try {
         Statement stmt = connection.createStatement();
	 results = stmt.executeQuery(requete);
	 
	 int count=0;
	 while (results.next()) {
            count++;
	    int empid = results.getInt(1);
	    String empfirstname = results.getString(3); // caution, risky here if changes
	    String emplastname = results.getString(4);
	    String empgender = results.getString(5);
	    String empbirthdate = results.getString(2); // caution, that is exactly what should be avoided
            String emphiredate = results.getString(6);
	    Emp emp_item = new Emp(empid, empfirstname, emplastname, empgender, empbirthdate, emphiredate);
	    empslist.add(emp_item);

	 }
	 // return a null object if no item with "empname" was found
	 results.close();
      } catch (SQLException e) {
	      // treatment
      }
      return empslist;	   
   }
// procedure that perform a stmt.executeQuery and stores the result in the List<Map..
// 
   public List<Map<String,String>> searchEmpA() throws SQLException
   {
      // definition of HashMap that contains the list of the request results
      List<Map<String,String>> resultslist = new ArrayList<Map<String,String>>();
      String requete="SELECT * FROM employee";
      ResultSet results;
      try {
         Statement stmt = connection.createStatement();
	 results = stmt.executeQuery(requete);
   
	 while (results.next()) { // the model fills the List that will be passed by the controller to the view
           Map<String, String> record= new HashMap<String, String>();
	   record.put("empname", results.getString(1)); 
	   resultslist.add(record); 
         }
      } catch (SQLException e) {
        // treatment
      }
      return resultslist;
   }

}

