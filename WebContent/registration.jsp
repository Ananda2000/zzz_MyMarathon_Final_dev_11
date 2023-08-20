<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration jsp page</title>
</head>
<body>

<form action="registrationServlet" method="post">

<table>

<tr>
	<td>First_name</td><td><input type=text name=usernmae></td>
</tr>

<tr> 
	<td>Email_ID</td> <td> <input type="text" name =emailid> </td>
</tr>
<tr> 
	<td> password </td> <td> <input type = "password" name =passwd></td> 
</tr>

<tr> <td> <button> SUBMIT</button></td> <td> <button>CANCEL</button>
</table>


</form>
</body>
</html>