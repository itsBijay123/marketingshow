<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Real</h2>
<form action="updateReal" method="post">
<pre>
Id<input type="hidden" name="id" value="${real.id }"/>
First Name<input type="text" name="firstName" value="${real.firstName }"/>
Last Name<input type="text" name="lastName" value="${real.lastName }"/>
Email<input type="text" name="email" value="${real.email }"/>
Mobile<input type="text" name="mobile" value="${real.mobile }"/>
      <input type="submit" value="update"/>
</pre>
</form>

</body>
</html>