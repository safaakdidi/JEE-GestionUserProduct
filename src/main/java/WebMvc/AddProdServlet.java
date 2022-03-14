package WebMvc;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

import metier.GestionProduit;
import metier.GestionUtilisateur;
import metier.Produit;
import jakarta.servlet.RequestDispatcher;
import  jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import  jakarta.servlet.http.HttpServletRequest;
import  jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import metier.Utilisateur;
/**
 * Servlet implementation class AddProdServlet
 */
public class AddProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddProdServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  nom=request.getParameter("nom");
		String description=request.getParameter("description");
		int  quantite=Integer.parseInt(request.getParameter("quantite"));
		double prix=Double.parseDouble(request.getParameter("prix"));
		
		GestionProduit gp=new GestionProduit();
		
		gp.ajouter(nom,description,quantite,prix);
		
		
		List<Produit> v=gp.lister();
	
		request.setAttribute("prods",v);
		request.getSession().setAttribute("prods",v);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("CatalogueView.jsp") ;	
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
