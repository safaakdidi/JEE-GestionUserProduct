package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Produit;
import metier.Utilisateur;
public class CatalogueDAO {

	public void updateProd(int id,String l,String p,int e1,double v) {
		Connection conn=Utilitaire.getConnection();
	  
	    try {

	       
	        PreparedStatement ps = conn.prepareStatement("UPDATE PRODUITS SET nom = ? , description = ? , quantite = ? , prix = ? WHERE code = ?");
	        ps.setString(1,l);
	        ps.setString(2,p);
	        ps.setInt(3,e1);
	        ps.setDouble(4,v);
	        ps.setInt(5,id);
	       
	        int resultSet = ps.executeUpdate();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	
public List<Produit> getProduitsParMotCle(String mc) {
List<Produit> prods= new ArrayList<Produit>();

Connection conn=Utilitaire.getConnection();

try {
PreparedStatement ps= conn.prepareStatement("select * from PRODUITS where UPPER(nom) LIKE ?");
String s="%"+mc+"%";
ps.setString(1, s.toUpperCase());

ResultSet rs = ps.executeQuery();

while (rs.next()) {

	Produit p = new Produit();

p.setCode(rs.getInt("code"));

p.setNom(rs.getString("nom"));
p.setDescription(rs.getString("description"));
p.setQuantite(rs.getInt("quantite"));


p.setPrix(rs.getDouble("prix"));

prods.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}


public Produit findProdByCode(int code){
Connection conn=Utilitaire.getConnection();
Produit u=null;
try {
PreparedStatement ps=conn.prepareStatement("select * from PRODUITS  where code=?");


ps.setInt(1,code);

ResultSet rsUser=ps.executeQuery();


if(rsUser.next()){
u=new Produit();
u.setCode((Integer)rsUser.getInt("code"));
u.setNom(rsUser.getString("nom"));
u.setDescription(rsUser.getString("description"));
u.setQuantite(rsUser.getInt("quantite"));
u.setPrix(rsUser.getDouble("prix"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return u;
}



public void addProd(String l,String p, int e,Double v){
Connection conn=Utilitaire.getConnection();
Produit u=null;
try {
PreparedStatement ps=conn.prepareStatement("insert into PRODUITS (nom,description,quantite,prix) values(?,?,?,?)");

ps.setString(1,l);
ps.setString(2,p);
ps.setInt(3,e);
ps.setDouble(4,v);

ps.executeUpdate();
} catch (SQLException e2) {
e2.printStackTrace();
}
}





public List<Produit> selectAll(){
	List<Produit> prods= new ArrayList<Produit>();

	Connection conn=Utilitaire.getConnection();
	try {
		PreparedStatement ps= conn.prepareStatement("select * from PRODUITS");

		

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Produit p = new Produit();

		p.setCode(rs.getInt("code"));

		p.setNom(rs.getString("nom"));
		p.setDescription(rs.getString("description"));
		p.setQuantite(rs.getInt("quantite"));

		p.setPrix(rs.getDouble("prix"));

		prods.add(p);
		}
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return prods;
		}
public void deleteProd(Integer id) {
	Connection conn=Utilitaire.getConnection();
	Produit u=null;
	try {
	PreparedStatement ps=conn.prepareStatement("delete from PRODUITS where code=? ");
	
	ps.setInt(1,id);
	
	ps.executeUpdate();
	
	} catch (SQLException e2) {
		e2.printStackTrace();
		}
		}
}
