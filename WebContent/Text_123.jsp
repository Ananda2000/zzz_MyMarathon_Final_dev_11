<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
Hello world!!
<a href="registration.jsp"> click here to Register</a>

HERE ARE THE LIST OF USERS ---------------

<table class ="table table-anand" >
	<tr>
		<th> First Name</th>
		<th> email id </th>
		<th> Password </th>
	</tr>
	
	<tbody>
		<c:forEach var="user" items ="${list}">
			<tr>
				<td><c:out value="${user.first_name}"></c:out> </td>
				<td> <c:out value="${user.email_ID}"></c:out></td>
				<td> <c:out value ="${user.password}"></c:out></td>
			</tr>
			
		</c:forEach>
	</tbody>


</table>




</body>
</html>