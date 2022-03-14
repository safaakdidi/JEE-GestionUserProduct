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
 * Servlet implementation class DeleteProd
 */
public class DeleteProd extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteProd() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int code=Integer.parseInt(request.getParameter("code"));
		GestionProduit gu=new GestionProduit();
		gu.supprimer(code);
		
		List<Produit> v=gu.lister();
		
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
