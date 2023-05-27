<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.*" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>DoLogin</title>
</head>
<body>
  <h1>show message</h1>
  <p><c:out value="${msg}"/>
  </p>
  
 <!--  <p>  <a href="${pageContext.request.contextPath}/empform">Add employee</a> </p> -->
</body>
</html>
