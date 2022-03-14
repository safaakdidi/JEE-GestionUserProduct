package dao;

import java.sql.*;
import java.util.Vector;



import metier.Utilisateur;
public class GestUsersDAO {
	
public Utilisateur loadUser(String login, String pass){
Connection conn=Utilitaire.getConnection();
Utilisateur u=null;
try {
PreparedStatement ps=conn.prepareStatement("select * from utilisateurs  where login=? and pass=?");


ps.setString(1,login);
ps.setString(2,pass);
ResultSet rsUser=ps.executeQuery();
if(rsUser.next()){
u=new Utilisateur();
u.setIdUser(new Integer(rsUser.getInt("ID_USER")));
u.setLogin(rsUser.getString("LOGIN"));
u.setPass(rsUser.getString("PASS"));
u.setEmail(rsUser.getString("EMAIL"));
u.setVille(rsUser.getString("VILLE"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return u;
}
public void updateUser(int id,String l,String p,String e1,String v) {
	Connection conn=Utilitaire.getConnection();
  
    try {

       
        PreparedStatement ps = conn.prepareStatement("UPDATE utilisateurs SET LOGIN = ? , PASS = ? , EMAIL = ? , VILLE = ? WHERE id = ?");
        ps.setString(1,l);
        ps.setString(2,p);
        ps.setString(3,e1);
        ps.setString(4,v);
        ps.setInt(5,id);
       
        int resultSet = ps.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


public Utilisateur findUserById(int id){
Connection conn=Utilitaire.getConnection();
Utilisateur u=null;
try {
PreparedStatement ps=conn.prepareStatement("select * from utilisateurs  where ID_User=?");


ps.setInt(1,id);

ResultSet rsUser=ps.executeQuery();


if(rsUser.next()){
u=new Utilisateur();
u.setIdUser((Integer)rsUser.getInt("ID_USER"));
u.setLogin(rsUser.getString("LOGIN"));
u.setPass(rsUser.getString("PASS"));
u.setEmail(rsUser.getString("EMAIL"));
u.setVille(rsUser.getString("VILLE"));
}
} catch (SQLException e) {
e.printStackTrace();
}
return u;
}


public void addUser(String l,String p, String e,String v){
Connection conn=Utilitaire.getConnection();
Utilisateur u=null;
try {
PreparedStatement ps=conn.prepareStatement("insert into utilisateurs (LOGIN,PASS,EMAIL,VILLE) values(?,?,?,?)");

ps.setString(1,l);
ps.setString(2,p);
ps.setString(3,e);
ps.setString(4,v);
ps.executeUpdate();
} catch (SQLException e2) {
e2.printStackTrace();
}
}




public void deleteUser(Integer id) {
	Connection conn=Utilitaire.getConnection();
	Utilisateur u=null;
	try {
	PreparedStatement ps=conn.prepareStatement("delete from utilisateurs where ID_USER=? ");
	
	ps.setInt(1,id);
	
	ps.executeUpdate();
	
	} catch (SQLException e2) {
		e2.printStackTrace();
		}
		}
public Vector<Utilisateur> selectAll(){
Connection conn=Utilitaire.getConnection();
Vector<Utilisateur> users=new Vector<Utilisateur>();
Utilisateur u=null;
try {
PreparedStatement ps=conn.prepareStatement("select * from utilisateurs"); 

ResultSet rsUser=ps.executeQuery();
while(rsUser.next()){
u=new Utilisateur();
u.setIdUser(new Integer(rsUser.getInt("ID_USER")));
u.setLogin(rsUser.getString("LOGIN"));
u.setPass(rsUser.getString("PASS"));
u.setEmail(rsUser.getString("EMAIL"));
u.setVille(rsUser.getString("VILLE"));
users.add(u);
}
} catch (SQLException e) {
e.printStackTrace();
}
return users;}}
