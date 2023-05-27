<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
	<! DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Adding Page</title>
</head>
<body>
  <h1>Add Employee here</h1>
  <hr>

  <form action=${pageContext.request.contextPath}/empform" method="post"> 

  <table>
    <tr>
      <td>Name: </td>
      <td><input type="text" name="empname" /></td>
    </tr>
    <tr>
      <td>Salary :</td>
      <td><input type="text" name="salary" /></td>
    </tr>
    <tr>
      <td>Designation :</td>
      <td><input type="text" name="designation" /></td>
    </tr>
    <tr>
      <td colspan="2">
	      <input type="submit" value="Save" /></td>
    </tr>
  </table>

  </form>
</body>
