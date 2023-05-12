<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Reals</title>
</head>
<body>
<h2>List All Reals..</h2>
<table>
<tr>
<th>Id</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Mobile</th>
<th>Actions</th>
</tr>

<c:forEach var="real" items="${reals }">
<tr>
<td>${real.id }</td>
<td>${real.firstName }</td>
<td>${real.lastName }</td>
<td>${real.email }</td>
<td>${real.mobile }</td>
<td>
<a href="delete?id=${real.id }">delete</a>
<a href="update?id=${real.id }">update</a>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>
