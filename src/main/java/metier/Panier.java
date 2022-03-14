package metier;
import java.util.ArrayList;

import dao.CatalogueDAO;
import metier.* ; 
public class Panier {
private ArrayList <LigneProduit> items = new ArrayList<LigneProduit>() ; 
private Double totale ; 
public Panier(){
}
public double getTotale(){
	setTotale() ; 

	return totale ; 
}

public void setTotale(){
	 Double somme = (double) 0 ; 
	 if(items.size() !=0){
	 for( LigneProduit p : items){	 
		somme =somme + p.getQuantite() * p.getProduit().getPrix() ; 
	 }}
	 this.totale=somme ; 
}

 public ArrayList <LigneProduit> getItems(){
	return items ; 
	
}
 

 public void setItems( ArrayList <LigneProduit> items){
	this.items=items ; 
}
 public void addItem(int code ,int quantite){
		
	 boolean flag =true ;
	 
	 if(items.size() !=0){
		 
	 
	 for(LigneProduit p : items){
if(p.getProduit().getCode()==code){
		 p.setQuanitite(p.getQuantite()+quantite);
			 flag =false ;
	 System.out.println("IM if  : " + code +" old false ") ;


}
	 }
	 }	
	 if (flag==true){
	 System.out.println("IM A CODE : " + code +" new true") ;
	 GestionProduit catalogue = new GestionProduit() ; 
     Produit p1 = catalogue.ChercherId(code) ;
	LigneProduit  prod= new LigneProduit(p1,quantite); 
	items.add(prod) ; 
			
	}
	 
 }
 public LigneProduit getLigneProduitparCode(int code){
	 for(LigneProduit p : items){
if(p.getProduit().getCode()==code){
return p ; 
}}
	return null;
 }
 
 
 
public void DeleteItem(int code ) {

	 for(LigneProduit p : items){
if(p.getProduit().getCode()==code){
	items.remove(p) ;  
	 System.out.println("item deleted ") ;
	break ; 

}
	
	 }
}	


}

