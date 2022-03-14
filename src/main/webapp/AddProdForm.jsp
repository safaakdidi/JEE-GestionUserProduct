<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM METHOD="GET" action="AddProdServlet">
<P NAME="id"> please enter product informations:

<P> nom: <INPUT NAME="nom" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20">
<P> description: <INPUT NAME="description" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20" >
<P> quantite: <INPUT NAME="quantite" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20" >
<P> prix: <INPUT NAME="prix" TYPE=" TEXT" SIZE=" 12" MAXLENGTH=" 20" >

<P> Thank you! <INPUT TYPE="SUBMIT">
</FORM>
</body>
</html>