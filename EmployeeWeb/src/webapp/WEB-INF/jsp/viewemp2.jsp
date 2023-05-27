<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.*" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Emp Login</title>
</head>
<body>
  <table>
     <td><label>Enter employee first name</label></td>
     <td><input type="text" name="firstname"></td>

     <td><label>Enter employee last name</label></td>
     <td><input type="text" name="lastname"></td>

     <td><label>Select gender</label></td>
     <td><input type="radio" name="gender" value="male"><input type="radio" name="gender" value="female"></td>
     <td>
  </table>
</body>
</html>

