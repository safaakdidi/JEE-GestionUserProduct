package metier;

import dao.GestUsersDAO;

import metier.Utilisateur;

import java.util.Vector;
/**
*
* @author USER
*/
public class GestionUtilisateur {
GestUsersDAO dao;

public GestionUtilisateur()
{
dao=new GestUsersDAO();
}
public Utilisateur Chercher(String login, String pass){
return dao.loadUser(login, pass);
}
public Utilisateur ChercherId(int id){
return dao.findUserById(id);
}
public void ajouter(String l,String p, String e,String v){
dao.addUser(l,p,e,v);
}
public Vector<Utilisateur> lister(){
return dao.selectAll();
}
public void supprimer(Integer id) {
	dao.deleteUser(id);
}
public void update(int id,String l,String p,String e1,String v) {
	dao.updateUser(id, l, p, e1, v);
}
}