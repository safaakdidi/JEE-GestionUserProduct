<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Vector" %>
<%@ page import=" metier.Utilisateur" %>
<%@ page import=" metier.GestionUtilisateur" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>
<%   GestionUtilisateur gestionUtilisateur = new GestionUtilisateur(); %>
  
  <%  Vector<Utilisateur> users = gestionUtilisateur.lister();
         request.getSession().setAttribute("list", users); %>
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
      
    <% for (Utilisateur u : users) {%>
       
                <tr>
                
                    
                   <td> <%= u.getIdUser()  %></td>
             <td> <%= u.getLogin()   %></td>
             <td><%= u.getEmail()  %></td>
             <td><%= u.getVille()  %></td>
                    
                  <td>
                        <a href="DeleteUser?id=<%=u.getIdUser() %>">
                            <button class="btn btn-danger">supprimer</button>
                        </a>
                        <a href="UpdateUser?id=<%=u.getIdUser() %>">
                            <button class="btn btn-primary">modifier</button>
                        </a>
                    </td>
                  
                 </tr>
        
            </tbody>
            
                 <%} %>
        </table>
     <a href="AddUser" >Add User</a>
    </div>
</body>
</html>
</body>
</html>