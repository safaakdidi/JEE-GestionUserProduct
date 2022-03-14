package metier;

import java.io.Serializable;
public class Produit implements Serializable{
private int code;
private String nom;
private String description;
private int quantite;
private double prix;
public Produit() {
super();
}
public Produit(String nomProduit, double prix,String description,int quantite) {
super();
this.nom = nomProduit;
this.prix = prix;
this.description=description;
this.quantite=quantite;
}
public int getCode() {
return code;
}
public void setCode(int idProduit) {
this.code = idProduit;
}
public String getNom() {
return nom;
}
public void setNom(String nomProduit) {
this.nom = nomProduit;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
}