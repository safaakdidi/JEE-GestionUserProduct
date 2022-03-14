<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import=" metier.Produit" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<% Produit prod=(Produit)request.getSession().getAttribute("prod"); %>
<body>
<P> Please fill out this form with your name.
Thanks!
<FORM METHOD="GET" action="UpdateProdServlet">
<P> Please enter the new values:
<INPUT NAME="code" TYPE="HIDDEN" SIZE=" 12" MAXLENGTH=" 20" value="<%=prod.getCode() %>">
<P>Nom: <INPUT NAME="nom" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="<%=prod.getNom() %>">
<P> description: <INPUT NAME="description" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="<%=prod.getDescription() %>">
<P> Quantite: <INPUT NAME="quantite" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="<%=prod.getQuantite() %>">
<P> Prix: <INPUT NAME="prix" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20" value="<%=prod.getPrix() %>">

<P> Thank you! <INPUT TYPE="SUBMIT">
</FORM>
</body>
</html>