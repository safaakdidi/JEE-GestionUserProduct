package metier;

public class LigneProduit {
	private Produit produit ; 
	private int quantite ; 
	

	public LigneProduit(){
		
	}
public LigneProduit(Produit produit ,int quantite){
	this.produit=produit ; 
	this.quantite=quantite ; 
}
	 public Produit getProduit(){
		return produit ; 
	}
	 public int getQuantite(){
		 return quantite ; 
	 }
	 public void setProduit(Produit produit ){
		 this.produit =produit  ; 
	 }
	public void setQuanitite(int quantite){
		this.quantite = quantite ; 
	}

		
	}