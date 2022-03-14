<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ page import="java.util.*" %>
<%@ page import="metier.*" %>
<%@ page import="dao.*" %>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Catalogue</title>
</head>


<body>
<form action="SearchServlet" method="post" >
<input type="text" name="motCle" value="motCle">
<input type="submit" value="OK">
</form>
<table border="1" width="80%">
<tr>
<th>ID</th> <th>Nom</th> <th>Prix</th>
</tr>
<c:forEach items="${modele.produits}" var="p">
<tr>
<td>${p.idProduit}</td>
<td>${p.nomProduit}</td>
<td>${p.prix}</td>
</tr>
</c:forEach>
</table>
</body>
</html>