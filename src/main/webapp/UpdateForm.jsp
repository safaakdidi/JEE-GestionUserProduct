<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body>
<P> Please fill out this form with your name.
Thanks!
<FORM METHOD="GET" action="UpdateServlet">
<P> Please enter the new values:
<INPUT NAME="id" TYPE="HIDDEN" SIZE=" 12" MAXLENGTH=" 20" value="${user.getId()}">
<P> login: <INPUT NAME="login" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="${user.getLogin()}">
<P> password: <INPUT NAME="password" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="${user.getPass()}">
<P> Email: <INPUT NAME="email" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="${user.getEmail()}">
<P> VILLE: <INPUT NAME="ville" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="${user.getVille()}">

<P> Thank you! <INPUT TYPE="SUBMIT">
</FORM>
</body>
</html>