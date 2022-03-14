<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import=" metier.Produit" %>
<%@ page import=" metier.GestionProduit" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
</head>

  
<body>
<div class="container">
<form action="ListProduitServlet" method="post" >
<p>Mot Cle :<input type="text" name="motCle" value="">
<input type="submit" value="OK">
</form>
<%   List<Produit> prods=(List)request.getSession().getAttribute("prods"); %>

    <div>
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">code</th>
                <th scope="col">nom produit</th>
                  <th scope="col">description produit</th>
                   <th scope="col">quantite</th>
                    <th scope="col">prix </th>
                
            </tr>
            </thead>
            <tbody>
      
    <% for (Produit p : prods) {%>
       
                <tr>
                
                    
                   <td> <%= p.getCode()  %></td>
             <td> <%= p.getNom()   %></td>
             <td><%= p.getDescription()  %></td>
              <td><%= p.getQuantite() %></td>
             <td><%= p.getPrix()  %></td>
                    
                  <td>
                        <a href="DeleteProd?code=<%=p.getCode() %>">
                            <button class="btn btn-danger">supprimer</button>
                        </a>
                        <a href="UpdateProd?code=<%=p.getCode() %>&">
                            <button class="btn btn-primary">modifier</button>
                        </a>
                         <a href="AddPanier?code=<%=p.getCode() %>">
                            <button class="btn btn-danger">Ajouter au panier</button>
                        </a>
                    </td>
                  
                 </tr>
        
            </tbody>
            
                 <%} %>
        </table>
      <a href="AddProdForm.jsp" >Add produit</a>
    </div>
</body>
</html>
</body>
</html>