package com.javatpoint.models;

import java.util.ArrayList; 
import java.util.Map;
import java.util.HashMap;
import java.sql.*;

public class Database_Connectivity {

   private String server="localhost";
   private String port="8080";
   private String db="eltechdb";
   private String url; 
   private String dbusername;
   private String dbpassword;
   
   private Connection connection;
   public Database_Connectivity(String dbuser, String dbpass) {
      super();
      this.dbusername = dbuser;
      this.dbpassword = dbpass;
   }

   public void openConnection()  throws SQLException 
   {
      url="jdbc:mysql://"+server+":"+port+"/"+db;	   
      connection = DriverManager.getConnection(url, dbusername, dbpassword);
   }

   public Map<String, String> getResults(String username, String password)  throws SQLException 
{
       String query = "SELECT * FROM tblemployee WHERE tblemployee.first_name="+username;

       ResultSet result;
       Map<String, String> rowset = new HashMap<String, String>();

       try {
//          PreparedStatement prestmt = connection.preparedStatement(query);
//          prestmt.setParameter("name", username);
          Statement stmt = connection.createStatement();
	  result = stmt.executeQuery(query);
          if (result.next()) { // at east one row found that match the couple (name,password)
             rowset.put("name",username);
	     rowset.put("password",password);
	  }
	  result.close();
	  return rowset;
       }
       catch (SQLException e) {
          System.out.println("Error in Database_Connectivity getResults");
	  return rowset;
       }
   }

}
