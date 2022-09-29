<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure Page</title>
</head>
<body>
<div><p style="color: #00FF00">${message}</p></div>
<br>
<button onclick="window.location.href='/'" class="btn btn-primary">Product Home page</button>
</body>
</html>