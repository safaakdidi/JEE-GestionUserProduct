package metier;

import java.util.ArrayList;
import java.util.List;

import dao.CatalogueDAO;
import dao.GestUsersDAO;
import metier.Produit;
public class GestionProduit {
private String motCle;

public GestionProduit() {
	dao=new CatalogueDAO();
}


CatalogueDAO dao;

public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}


public List<Produit> lister(){
	return dao.selectAll();
}
public void ajouter(String l,String p, int e,double v){
dao.addProd(l,p,e,v);
}
public void supprimer(Integer id) {
	dao.deleteProd(id);
}
public void update(int id,String l,String p,int e1,double v) {
	dao.updateProd(id, l, p, e1, v);
}
public Produit ChercherId(int id){
return dao.findProdByCode(id);
}
public List<Produit> listerProduitsParMotCle(String mc){
	return dao.getProduitsParMotCle(mc);
}

}