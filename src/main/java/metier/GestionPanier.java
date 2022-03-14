package metier;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import dao.Utilitaire;

public class GestionPanier {

	
	
	 public void addArticleToPanier(int userId, int articleId) {
		 Connection conn=Utilitaire.getConnection();
	        try {

	            String query = "INSERT INTO panier(user_id,article_id) VALUES (?,?)";
	            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(query);
	            ps.setInt(1,userId);
	            ps.setInt(2,articleId);

	            int resultSet = ps.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
