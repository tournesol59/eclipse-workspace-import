<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.sql.*" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>List Page</title>
</head>
<body>
  <h1>List all Employee here</h1>
  <ul>
    <c:forEach items="${requestScope.emp}" var="emp">
      <li> <c:out value="${emp.name}"/> </li>
    </c: forEach>
  </ul>

  <p>
     <a href="${pageContext.request.contextPath}/javatpoint">Acceuil</a>
  </p>

