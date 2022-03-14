<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue</title>
</head>
<body>
<div class="container">


    <div>
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Login</th>
                  <th scope="col">Email</th>
                   <th scope="col">Ville</th>
                
            </tr>
            </thead>
            <tbody>

        
                <tr>
                    <td>${user.getIdUser()}</td>
                    <td>${user.getLogin()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getVille()}</td>
                  
                  
                </tr>
          
            </tbody>
        </table>
        <a href="ListServlet" >list users</a>
         <a href="ListProduitServlet" >consulter Catalogue</a>
         <a href="AddProdForm.jsp" >Add produit</a>
    </div>
</body>
</html>